package com.mycompany.app.model;


import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class PendingOrderJson {
    private long orderId;
    private String symbolName;
    private String orderType;
    private String tradeSide;
    private double price;
    private long volume;
    private Double stopLoss;
    private Double takeProfit;
    private long createTimestamp;
    private Long expirationTimestamp;
    private Double currentPrice;
    private Double distanceInPips;
    private String comment;
    private String channel;
    private String label;

    public long getOrderId() {
        return orderId;
    }

    public long getCreateTimestamp() {
        return createTimestamp;
    }

    public String getSymbolName() {
        return symbolName;
    }

    public String getOrderType() {
        return orderType;
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

    public double getPrice() {
        return price;
    }

    public Long getExpirationTimestamp() {
        return expirationTimestamp;
    }

    public Double getCurrentPrice() {
        return currentPrice;
    }

    public Double getDistanceInPips() {
        return distanceInPips;
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

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public void setCreateTimestamp(long createTimestamp) {
        this.createTimestamp = createTimestamp;
    }

    public void setSymbolName(String symbolName) {
        this.symbolName = symbolName;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
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

    public void setPrice(double price) {
        this.price = price;
    }

    public void setExpirationTimestamp(Long expirationTimestamp) {
        this.expirationTimestamp = expirationTimestamp;
    }

    public void setCurrentPrice(Double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public void setDistanceInPips(Double distanceInPips) {
        this.distanceInPips = distanceInPips;
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
