package com.mycompany.app.model;

public class TradingAccountJson {
    private Long accountId;
    private Long accountNumber;
    private Boolean live;
    private String brokerName;
    private String brokerTitle;
    private Long brokerCode;
    private String depositCurrency;
    private Long traderRegistrationTimestamp;
    private String traderAccountType;
    private Integer leverage;
    private Long balance;
    private Boolean deleted;

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Boolean isLive() {
        return live;
    }

    public void setLive(Boolean live) {
        this.live = live;
    }

    public String getBrokerTitle() {
        return brokerTitle;
    }

    public void setBrokerTitle(String brokerTitle) {
        this.brokerTitle = brokerTitle;
    }

    public Long getBrokerCode() {
        return brokerCode;
    }

    public void setBrokerCode(Long brokerCode) {
        this.brokerCode = brokerCode;
    }

    public String getDepositCurrency() {
        return depositCurrency;
    }

    public void setDepositCurrency(String depositCurrency) {
        this.depositCurrency = depositCurrency;
    }

    public Long getTraderRegistrationTimestamp() {
        return traderRegistrationTimestamp;
    }

    public void setTraderRegistrationTimestamp(Long traderRegistrationTimestamp) {
        this.traderRegistrationTimestamp = traderRegistrationTimestamp;
    }

    public String getTraderAccountType() {
        return traderAccountType;
    }

    public void setTraderAccountType(String traderAccountType) {
        this.traderAccountType = traderAccountType;
    }

    public Integer getLeverage() {
        return leverage;
    }

    public void setLeverage(Integer leverage) {
        this.leverage = leverage;
    }

    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public String getBrokerName() {
        return brokerName;
    }

    public void setBrokerName(String brokerName) {
        this.brokerName = brokerName;
    }
}
