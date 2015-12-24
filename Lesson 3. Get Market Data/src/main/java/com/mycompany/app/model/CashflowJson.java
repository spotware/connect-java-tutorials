package com.mycompany.app.model;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class CashflowJson {
    private long cashflowId;
    private String type;
    private long delta;
    private long balance;
    private long balanceVersion;
    private long changeTimestamp;
    private long equity;

    public long getCashflowId() {
        return cashflowId;
    }

    public String getType() {
        return type;
    }

    public long getDelta() {
        return delta;
    }

    public long getBalance() {
        return balance;
    }

    public long getBalanceVersion() {
        return balanceVersion;
    }

    public long getChangeTimestamp() {
        return changeTimestamp;
    }

    public void setCashflowId(long cashflowId) {
        this.cashflowId = cashflowId;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setDelta(long delta) {
        this.delta = delta;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public void setBalanceVersion(long balanceVersion) {
        this.balanceVersion = balanceVersion;
    }

    public void setChangeTimestamp(long changeTimestamp) {
        this.changeTimestamp = changeTimestamp;
    }

    public long getEquity() {
        return equity;
    }

    public void setEquity(long equity) {
        this.equity = equity;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}