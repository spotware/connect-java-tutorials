package com.mycompany.app;

import com.mycompany.app.model.TradingAccountJson;
import com.mycompany.app.model.TrendbarJson;
import org.jfree.ui.RefineryUtilities;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    private static final String API_HOST_URL = "https://sandbox-api.spotware.com";
    private static final String ACCOUNTS_API_TOKEN = "YzBiZjU4OWY4Mzc4NDE1ODE5MTk5MzhkNzEwYzM3MTYzYWY1M2QzMzk4NDMwNDJiMTdjNjdjMmVlNTFiYWY0ZQ";

    private AccountsAPI accountsApi;

    public App() {
        this.accountsApi = new AccountsAPI(API_HOST_URL, ACCOUNTS_API_TOKEN);
    }

    private TrendbarJson[] getMinuteTrendbars() {
        try {
            String accountId = "88979";
            String symbolName = "EURUSD";
            Calendar calendar = Calendar.getInstance();
            Date to = calendar.getTime();
            calendar.add(Calendar.HOUR, -5);
            Date from = calendar.getTime();
            return accountsApi.getMinuteTredbars(accountId, symbolName, from, to);
        } catch (AccountsAPIException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main( String[] args ) {
        App app = new App();
        TrendbarJson[] data = app.getMinuteTrendbars();
        final TrendBarsChart demo = new TrendBarsChart("EURUSD last 5 hours", app.getMinuteTrendbars());
        demo.pack();
        RefineryUtilities.centerFrameOnScreen(demo);
        demo.setVisible(true);
    }
}
