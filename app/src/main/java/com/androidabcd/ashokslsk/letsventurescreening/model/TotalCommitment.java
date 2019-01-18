
package com.androidabcd.ashokslsk.letsventurescreening.model;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class TotalCommitment {

    @SerializedName("amount")
    private Long mAmount;
    @SerializedName("short_unit")
    private String mShortUnit;
    @SerializedName("symbol")
    private String mSymbol;
    @SerializedName("text")
    private String mText;
    @SerializedName("unit")
    private String mUnit;

    public Long getAmount() {
        return mAmount;
    }

    public void setAmount(Long amount) {
        mAmount = amount;
    }

    public String getShortUnit() {
        return mShortUnit;
    }

    public void setShortUnit(String shortUnit) {
        mShortUnit = shortUnit;
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

}
