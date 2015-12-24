package com.mycompany.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;

/**
 * Hello world!
 *
 */
public class App 
{
    private static final String API_HOST_URL = "https://sandbox-api.spotware.com";
    private static final String SCHEMA_SERVICE = "/connect/schema";

    private static String callURL(String myURL) {
        System.out.println("Requsted URL:" + myURL);
        StringBuilder sb = new StringBuilder();
        try {
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
        } catch (Exception e) {
            throw new RuntimeException("Exception while calling URL:"+ myURL, e);
        }
        return sb.toString();
    }

    public static void main( String[] args ) {
        System.out.println( "Requesting of Open API schema" );
        System.out.println(callURL(API_HOST_URL + SCHEMA_SERVICE));

    }
}
