package com.mycompany.app.model;

import com.mycompany.app.model.enums.TradeSideType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class DealJson {
    private long dealId;
    private long positionId;
    private long orderId;
    private TradeSideType tradeSide;
    private long volume;
    private long filledVolume;
    private String symbolName;
    private long commission;
    private double executionPrice;
    private double baseToUsdConversionRate;
    private double marginRate;
    private String channel;
    private String label;
    private String comment;
    private long createTimestamp;
    private long executionTimestamp;
    private PositionCloseDetailsJson positionCloseDetails;

    public long getDealId() {
        return dealId;
    }

    public void setDealId(long dealId) {
        this.dealId = dealId;
    }

    public long getPositionId() {
        return positionId;
    }

    public void setPositionId(long positionId) {
        this.positionId = positionId;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public TradeSideType getTradeSide() {
        return tradeSide;
    }

    public void setTradeSide(TradeSideType tradeSide) {
        this.tradeSide = tradeSide;
    }

    public long getVolume() {
        return volume;
    }

    public void setVolume(long volume) {
        this.volume = volume;
    }

    public long getFilledVolume() {
        return filledVolume;
    }

    public void setFilledVolume(long filledVolume) {
        this.filledVolume = filledVolume;
    }

    public String getSymbolName() {
        return symbolName;
    }

    public void setSymbolName(String symbolName) {
        this.symbolName = symbolName;
    }

    public long getCommission() {
        return commission;
    }

    public void setCommission(long commission) {
        this.commission = commission;
    }

    public double getExecutionPrice() {
        return executionPrice;
    }

    public void setExecutionPrice(double executionPrice) {
        this.executionPrice = executionPrice;
    }

    public double getBaseToUsdConversionRate() {
        return baseToUsdConversionRate;
    }

    public void setBaseToUsdConversionRate(double baseToUsdConversionRate) {
        this.baseToUsdConversionRate = baseToUsdConversionRate;
    }

    public double getMarginRate() {
        return marginRate;
    }

    public void setMarginRate(double marginRate) {
        this.marginRate = marginRate;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public long getCreateTimestamp() {
        return createTimestamp;
    }

    public void setCreateTimestamp(long createTimestamp) {
        this.createTimestamp = createTimestamp;
    }

    public long getExecutionTimestamp() {
        return executionTimestamp;
    }

    public void setExecutionTimestamp(long executionTimestamp) {
        this.executionTimestamp = executionTimestamp;
    }

    public PositionCloseDetailsJson getPositionCloseDetails() {
        return positionCloseDetails;
    }

    public void setPositionCloseDetails(PositionCloseDetailsJson positionCloseDetails) {
        this.positionCloseDetails = positionCloseDetails;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

}
