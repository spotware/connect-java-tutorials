package com.mycompany.app.model;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class PositionJson {
    private long positionId;
    private long entryTimestamp;
    private long utcLastUpdateTimestamp;
    private String symbolName;
    private String tradeSide;
    private double entryPrice;
    private long volume;
    private Double stopLoss;
    private Double takeProfit;
    private Long profit;
    private Double profitInPips;
    private long commission;
    private Double marginRate;
    private Long swap;
    private Double currentPrice;
    private String comment;
    private String channel;
    private String label;

    public long getPositionId() {
        return positionId;
    }

    public long getEntryTimestamp() {
        return entryTimestamp;
    }

    public long getUtcLastUpdateTimestamp() {
        return utcLastUpdateTimestamp;
    }

    public String getSymbolName() {
        return symbolName;
    }

    public String getTradeSide() {
        return tradeSide;
    }

    public long getVolume() {
        return volume;
    }

    public Double getStopLoss() {
        return stopLoss;
    }

    public Double getTakeProfit() {
        return takeProfit;
    }

    public double getEntryPrice() {
        return entryPrice;
    }

    public Long getProfit() {
        return profit;
    }

    public Double getProfitInPips() {
        return profitInPips;
    }

    public long getCommission() {
        return commission;
    }

    public Double getMarginRate() {
        return marginRate;
    }

    public Long getSwap() {
        return swap;
    }

    public String getComment() {
        return comment;
    }

    public String getChannel() {
        return channel;
    }

    public String getLabel() {
        return label;
    }

    public void setPositionId(long positionId) {
        this.positionId = positionId;
    }

    public void setEntryTimestamp(long entryTimestamp) {
        this.entryTimestamp = entryTimestamp;
    }

    public void setUtcLastUpdateTimestamp(long utcLastUpdateTimestamp) {
        this.utcLastUpdateTimestamp = utcLastUpdateTimestamp;
    }

    public void setSymbolName(String symbolName) {
        this.symbolName = symbolName;
    }

    public void setTradeSide(String tradeSide) {
        this.tradeSide = tradeSide;
    }

    public void setVolume(long volume) {
        this.volume = volume;
    }

    public void setStopLoss(Double stopLoss) {
        this.stopLoss = stopLoss;
    }

    public void setTakeProfit(Double takeProfit) {
        this.takeProfit = takeProfit;
    }

    public void setEntryPrice(double entryPrice) {
        this.entryPrice = entryPrice;
    }

    public void setProfit(Long profit) {
        this.profit = profit;
    }

    public void setProfitInPips(Double profitInPips) {
        this.profitInPips = profitInPips;
    }

    public void setCommission(long commission) {
        this.commission = commission;
    }

    public void setMarginRate(Double marginRate) {
        this.marginRate = marginRate;
    }

    public void setSwap(Long swap) {
        this.swap = swap;
    }

    public Double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(Double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
