
package com.androidabcd.ashokslsk.letsventurescreening.model;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class FundingAsk {

    @SerializedName("amount")
    private Double mAmount;
    @SerializedName("symbol")
    private String mSymbol;
    @SerializedName("text")
    private String mText;
    @SerializedName("unit")
    private String mUnit;
    @SerializedName("value")
    private Long mValue;

    public Double getAmount() {
        return mAmount;
    }

    public void setAmount(Double amount) {
        mAmount = amount;
    }

    public String getSymbol() {
        return mSymbol;
    }

    public void setSymbol(String symbol) {
        mSymbol = symbol;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public String getUnit() {
        return mUnit;
    }

    public void setUnit(String unit) {
        mUnit = unit;
    }

    public Long getValue() {
        return mValue;
    }

    public void setValue(Long value) {
        mValue = value;
    }

}
