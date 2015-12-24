package com.mycompany.app;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mycompany.app.model.ErrorJson;
import com.mycompany.app.model.MessageJson;
import com.mycompany.app.model.TradingAccountJson;
import com.mycompany.app.model.TrendbarJson;
import org.apache.commons.lang3.text.StrSubstitutor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by sgologuzov on 08/04/2015.
 */
public class AccountsAPI {
    private static final String TRADING_ACCOUNTS_SERVICE = "/connect/tradingaccounts";
    private static final String MINUTE_TRENDBARS_SERVICE = "/connect/tradingaccounts/${id}/symbols/${symbolName}/trendbars/m1";

    private String root;
    private String authToken;
    private ObjectMapper mapper;

    public AccountsAPI(String root, String authToken) {
        this.root = root;
        this.authToken = authToken;
        this.mapper = new ObjectMapper();
    }

    private String getServiceURLString(String service) {
        return getServiceURLString(service, null);
    }

    private String getServiceURLString(String service, Map<String, String> pathParams) {
        return getServiceURLString(service, pathParams, null);
    }

    private String getServiceURLString(String service, Map<String, String> pathParams, Map<String, String> requestParams) {
        return getServiceURLString(service, pathParams, requestParams, true);
    }

    private String getServiceURLString(String service, Map<String, String> pathParams, Map<String, String> requestParams, boolean authRequired) {
        if (requestParams == null) {
            requestParams = new HashMap<>();
        }
        if (authRequired) {
            requestParams.put("oauth_token", authToken);
        }
        StringBuilder urlBuilder = new StringBuilder(root);
        urlBuilder.append(service);
        if (!requestParams.isEmpty()) {
            urlBuilder.append("?");
            StringBuilder parametersBuilder = new StringBuilder();
            for (Map.Entry<String, String> entry : requestParams.entrySet()) {
                if (parametersBuilder.length() > 0) {
                    parametersBuilder.append("&");
                }
                parametersBuilder.append(entry.getKey());
                parametersBuilder.append("=");
                parametersBuilder.append(entry.getValue());
            }
            urlBuilder.append(parametersBuilder);
        }
        if (pathParams != null) {
            StrSubstitutor sub = new StrSubstitutor(pathParams);
            sub.replaceIn(urlBuilder);
        }
        return urlBuilder.toString();
    }

    private static String callURL(String myURL) throws IOException {
        System.out.println("Requsted URL:" + myURL);
        StringBuilder sb = new StringBuilder();
        URL url = new URL(myURL);
        URLConnection urlConn = url.openConnection();
        if (urlConn != null)
            urlConn.setReadTimeout(60 * 1000);
        if (urlConn != null && urlConn.getInputStream() != null) {
            try(InputStreamReader in = new InputStreamReader(urlConn.getInputStream(), Charset.defaultCharset())){
                BufferedReader bufferedReader = new BufferedReader(in);
                if (bufferedReader != null) {
                    int cp;
                    while ((cp = bufferedReader.read()) != -1) {
                        sb.append((char) cp);
                    }
                    bufferedReader.close();
                }
            }
        }
        return sb.toString();
    }

    public TradingAccountJson[] getTradingAccounts() throws AccountsAPIException {
        String service = getServiceURLString(TRADING_ACCOUNTS_SERVICE);
        try {
            MessageJson<TradingAccountJson[]> messageJson = mapper.readValue(callURL(service),
                    new TypeReference<MessageJson<TradingAccountJson[]>>() { });
            ErrorJson error = messageJson.getError();
            if (error != null) {
                throw new AccountsAPIException(error.getErrorCode(), error.getDescription());
            }
            return messageJson.getData();
        } catch (Exception e) {
            throw new AccountsAPIException(e);
        }
    }

    public TrendbarJson[] getMinuteTredbars (String accountId, String symbolName, Date from, Date to) throws AccountsAPIException {
        Map<String, String> pathParams = new HashMap<>();
        pathParams.put("id", accountId);
        pathParams.put("symbolName", symbolName);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        Map<String, String> requestParams = new HashMap<>();
        requestParams.put("from", sdf.format(from));
        requestParams.put("to", sdf.format(to));

        String service = getServiceURLString(MINUTE_TRENDBARS_SERVICE, pathParams, requestParams);
        try {
            MessageJson<TrendbarJson[]> messageJson = mapper.readValue(callURL(service),
                    new TypeReference<MessageJson<TrendbarJson[]>>() { });
            ErrorJson error = messageJson.getError();
            if (error != null) {
                throw new AccountsAPIException(error.getErrorCode(), error.getDescription());
            }
            return messageJson.getData();
        } catch (Exception e) {
            throw new AccountsAPIException(e);
        }
    }
}
