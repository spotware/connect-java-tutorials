package com.mycompany.app.model.enums;


public enum TradeSideType {
    BUY(1), SELL(2);

    private final int id;

    TradeSideType(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public TradeSideType getOpposite() {
        return this == BUY ? SELL : BUY;
    }

    public static TradeSideType valueOf(int id) {
        switch (id) {
            case 1:
                return BUY;
            case 2:
                return SELL;
            default:
                throw new IllegalArgumentException("Unsupported trade side with id=" + id);
        }
    }
}
