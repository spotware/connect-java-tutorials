package com.mycompany.app;

import com.mycompany.app.model.TradingAccountJson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    private static final String API_HOST_URL = "https://sandbox-api.spotware.com";
    private static final String ACCOUNTS_API_TOKEN = "NGQ1ODJkODFlZGVmZDM5NTQ5ODc2YjczYmIwZWM2ODhjZjUwNDhlNzY2NGQyMjVmODZjYTQ2MmNjZTQwYjM1Mw";

    private AccountsAPI accountsApi;

    public App() {
        this.accountsApi = new AccountsAPI(API_HOST_URL, ACCOUNTS_API_TOKEN);
    }

    private void printAccounts() {
        try {
            TradingAccountJson[] accounts = accountsApi.getTradingAccounts();
            for (TradingAccountJson account : accounts) {
                System.out.println("********* Account " + account.getAccountNumber() + " ***********");
                System.out.println("ID: " + account.getAccountId());
                System.out.println("Number: " + account.getAccountNumber());
                System.out.println("Currency: " + account.getDepositCurrency());
                System.out.println("Balance: " + account.getBalance());
                System.out.println("Live: " + account.isLive());
                System.out.println("Broker: " + account.getBrokerTitle());
            }
        } catch (AccountsAPIException e) {
            e.printStackTrace();
        }
    }

    public static void main( String[] args ) {
        App app = new App();
        app.printAccounts();
    }
}
