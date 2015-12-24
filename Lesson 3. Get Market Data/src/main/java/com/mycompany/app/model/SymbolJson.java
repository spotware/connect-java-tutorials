package com.mycompany.app.model;

public class SymbolJson {
    private String symbolName;
    private int digits;
    private int pipPosition;
    private String measurementUnits;
    private String baseAsset;
    private String quoteAsset;
    private boolean tradeEnabled;
    private double tickSize;
    private String description;
    private int maxLeverage;
    private double swapLong;
    private double swapShort;
    private String threeDaysSwaps;
    private long minOrderVolume;
    private long minOrderStep;
    private long maxOrderVolume;
    private String assetClass;
    private Double lastBid;
    private Double lastAsk;

    public String getSymbolName() {
        return symbolName;
    }

    public void setSymbolName(String symbolName) {
        this.symbolName = symbolName;
    }

    public int getDigits() {
        return digits;
    }

    public void setDigits(int digits) {
        this.digits = digits;
    }

    public int getPipPosition() {
        return pipPosition;
    }

    public void setPipPosition(int pipPosition) {
        this.pipPosition = pipPosition;
    }

    public String getMeasurementUnits() {
        return measurementUnits;
    }

    public void setMeasurementUnits(String measurementUnits) {
        this.measurementUnits = measurementUnits;
    }

    public String getBaseAsset() {
        return baseAsset;
    }

    public void setBaseAsset(String baseAsset) {
        this.baseAsset = baseAsset;
    }

    public String getQuoteAsset() {
        return quoteAsset;
    }

    public void setQuoteAsset(String quoteAsset) {
        this.quoteAsset = quoteAsset;
    }

    public boolean getTradeEnabled() {
        return tradeEnabled;
    }

    public void setTradeEnabled(boolean tradeEnabled) {
        this.tradeEnabled = tradeEnabled;
    }

    public double getTickSize() {
        return tickSize;
    }

    public void setTickSize(double tickSize) {
        this.tickSize = tickSize;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getMaxLeverage() {
        return maxLeverage;
    }

    public void setMaxLeverage(int maxLeverage) {
        this.maxLeverage = maxLeverage;
    }

    public long getMinOrderVolume() {
        return minOrderVolume;
    }

    public void setMinOrderVolume(long minOrderVolume) {
        this.minOrderVolume = minOrderVolume;
    }

    public long getMinOrderStep() {
        return minOrderStep;
    }

    public void setMinOrderStep(long minOrderStep) {
        this.minOrderStep = minOrderStep;
    }

    public long getMaxOrderVolume() {
        return maxOrderVolume;
    }

    public void setMaxOrderVolume(long maxOrderVolume) {
        this.maxOrderVolume = maxOrderVolume;
    }

    public double getSwapLong() {
        return swapLong;
    }

    public void setSwapLong(double swapLong) {
        this.swapLong = swapLong;
    }

    public double getSwapShort() {
        return swapShort;
    }

    public void setSwapShort(double swapShort) {
        this.swapShort = swapShort;
    }

    public String getThreeDaysSwaps() {
        return threeDaysSwaps;
    }

    public void setThreeDaysSwaps(String threeDaysSwaps) {
        this.threeDaysSwaps = threeDaysSwaps;
    }

    public String getAssetClass() {
        return assetClass;
    }

    public void setAssetClass(String assetClass) {
        this.assetClass = assetClass;
    }

    public Double getLastAsk() {
        return lastAsk;
    }

    public void setLastAsk(Double lastAsk) {
        this.lastAsk = lastAsk;
    }

    public Double getLastBid() {
        return lastBid;
    }

    public void setLastBid(Double lastBid) {
        this.lastBid = lastBid;
    }
}
