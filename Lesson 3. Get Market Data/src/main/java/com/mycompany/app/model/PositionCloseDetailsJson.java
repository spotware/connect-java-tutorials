package com.mycompany.app.model;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class PositionCloseDetailsJson {
    private double entryPrice;
    private long profit;
    private long swap;
    private long commission;
    private long balance;
    private long balanceVersion;
    private String comment;
    private Double stopLossPrice;
    private Double takeProfitPrice;
    private Double quoteToDepositConversionRate;
    private long closedVolume;
    private Double profitInPips;
    private double roi;
    private long equity;
    private long positionOpenTimestamp;

    public double getEntryPrice() {
        return entryPrice;
    }

    public void setEntryPrice(double entryPrice) {
        this.entryPrice = entryPrice;
    }

    public long getProfit() {
        return profit;
    }

    public void setProfit(long profit) {
        this.profit = profit;
    }

    public long getSwap() {
        return swap;
    }

    public void setSwap(long swap) {
        this.swap = swap;
    }

    public long getCommission() {
        return commission;
    }

    public void setCommission(long commission) {
        this.commission = commission;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public long getBalanceVersion() {
        return balanceVersion;
    }

    public void setBalanceVersion(long balanceVersion) {
        this.balanceVersion = balanceVersion;
    }

    public long getClosedVolume() {
        return closedVolume;
    }

    public void setClosedVolume(long closedVolume) {
        this.closedVolume = closedVolume;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Double getStopLossPrice() {
        return stopLossPrice;
    }

    public void setStopLossPrice(Double stopLossPrice) {
        this.stopLossPrice = stopLossPrice;
    }

    public Double getTakeProfitPrice() {
        return takeProfitPrice;
    }

    public void setTakeProfitPrice(Double takeProfitPrice) {
        this.takeProfitPrice = takeProfitPrice;
    }

    public Double getQuoteToDepositConversionRate() {
        return quoteToDepositConversionRate;
    }

    public void setQuoteToDepositConversionRate(Double quoteToDepositConversionRate) {
        this.quoteToDepositConversionRate = quoteToDepositConversionRate;
    }

    public Double getProfitInPips() {
        return profitInPips;
    }

    public void setProfitInPips(Double profitInPips) {
        this.profitInPips = profitInPips;
    }

    public double getRoi() {
        return roi;
    }

    public void setRoi(double roi) {
        this.roi = roi;
    }

    public long getEquity() {
        return equity;
    }

    public void setEquity(long equity) {
        this.equity = equity;
    }

    public long getPositionOpenTimestamp() {
        return positionOpenTimestamp;
    }

    public void setPositionOpenTimestamp(long positionOpenTimestamp) {
        this.positionOpenTimestamp = positionOpenTimestamp;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }


}