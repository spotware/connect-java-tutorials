package com.mycompany.app;

/**
 * Created by sgologuzov on 08/04/2015.
 */
public class AccountsAPIException extends Exception {
    private String code;
    private String message;

    public AccountsAPIException(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public AccountsAPIException(Exception nested) {
        super(nested);
        this.message = nested.getMessage();
    }

    @Override
    public String getMessage() {
        return message;
    }
}
