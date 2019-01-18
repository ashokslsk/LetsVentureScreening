
package com.androidabcd.ashokslsk.letsventurescreening.model;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;
import java.util.List;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Startup {

    @SerializedName("commited_investors")
    private List<CommitedInvestor> mCommitedInvestors;
    @SerializedName("commitment_percentage")
    private Long mCommitmentPercentage;
    @SerializedName("dilution")
    private String mDilution;
    @SerializedName("founded")
    private String mFounded;
    @SerializedName("funding_ask")
    private FundingAsk mFundingAsk;
    @SerializedName("funding_status")
    private String mFundingStatus;
    @SerializedName("id")
    private Long mId;
    @SerializedName("interacted")
    private Boolean mInteracted;
    @SerializedName("is_liked")
    private Object mIsLiked;
    @SerializedName("location")
    private String mLocation;
    @SerializedName("logo")
    private Logo mLogo;
    @SerializedName("market")
    private String mMarket;
    @SerializedName("name")
    private String mName;
    @SerializedName("permalink")
    private String mPermalink;
    @SerializedName("product_summary")
    private String mProductSummary;
    @SerializedName("raising")
    private Object mRaising;
    @SerializedName("round_type")
    private String mRoundType;
    @SerializedName("sectors")
    private String mSectors;
    @SerializedName("stage")
    private String mStage;
    @SerializedName("startup_type")
    private String mStartupType;
    @SerializedName("stealth")
    private Boolean mStealth;
    @SerializedName("stripe")
    private String mStripe;
    @SerializedName("summary")
    private String mSummary;
    @SerializedName("team_members")
    private List<TeamMember> mTeamMembers;
    @SerializedName("total_commitment")
    private TotalCommitment mTotalCommitment;

    public List<CommitedInvestor> getCommitedInvestors() {
        return mCommitedInvestors;
    }

    public void setCommitedInvestors(List<CommitedInvestor> commitedInvestors) {
        mCommitedInvestors = commitedInvestors;
    }

    public Long getCommitmentPercentage() {
        return mCommitmentPercentage;
    }

    public void setCommitmentPercentage(Long commitmentPercentage) {
        mCommitmentPercentage = commitmentPercentage;
    }

    public String getDilution() {
        return mDilution;
    }

    public void setDilution(String dilution) {
        mDilution = dilution;
    }

    public String getFounded() {
        return mFounded;
    }

    public void setFounded(String founded) {
        mFounded = founded;
    }

    public FundingAsk getFundingAsk() {
        return mFundingAsk;
    }

    public void setFundingAsk(FundingAsk fundingAsk) {
        mFundingAsk = fundingAsk;
    }

    public String getFundingStatus() {
        return mFundingStatus;
    }

    public void setFundingStatus(String fundingStatus) {
        mFundingStatus = fundingStatus;
    }

    public Long getId() {
        return mId;
    }

    public void setId(Long id) {
        mId = id;
    }

    public Boolean getInteracted() {
        return mInteracted;
    }

    public void setInteracted(Boolean interacted) {
        mInteracted = interacted;
    }

    public Object getIsLiked() {
        return mIsLiked;
    }

    public void setIsLiked(Object isLiked) {
        mIsLiked = isLiked;
    }

    public String getLocation() {
        return mLocation;
    }

    public void setLocation(String location) {
        mLocation = location;
    }

    public Logo getLogo() {
        return mLogo;
    }

    public void setLogo(Logo logo) {
        mLogo = logo;
    }

    public String getMarket() {
        return mMarket;
    }

    public void setMarket(String market) {
        mMarket = market;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getPermalink() {
        return mPermalink;
    }

    public void setPermalink(String permalink) {
        mPermalink = permalink;
    }

    public String getProductSummary() {
        return mProductSummary;
    }

    public void setProductSummary(String productSummary) {
        mProductSummary = productSummary;
    }

    public Object getRaising() {
        return mRaising;
    }

    public void setRaising(Object raising) {
        mRaising = raising;
    }

    public String getRoundType() {
        return mRoundType;
    }

    public void setRoundType(String roundType) {
        mRoundType = roundType;
    }

    public String getSectors() {
        return mSectors;
    }

    public void setSectors(String sectors) {
        mSectors = sectors;
    }

    public String getStage() {
        return mStage;
    }

    public void setStage(String stage) {
        mStage = stage;
    }

    public String getStartupType() {
        return mStartupType;
    }

    public void setStartupType(String startupType) {
        mStartupType = startupType;
    }

    public Boolean getStealth() {
        return mStealth;
    }

    public void setStealth(Boolean stealth) {
        mStealth = stealth;
    }

    public String getStripe() {
        return mStripe;
    }

    public void setStripe(String stripe) {
        mStripe = stripe;
    }

    public String getSummary() {
        return mSummary;
    }

    public void setSummary(String summary) {
        mSummary = summary;
    }

    public List<TeamMember> getTeamMembers() {
        return mTeamMembers;
    }

    public void setTeamMembers(List<TeamMember> teamMembers) {
        mTeamMembers = teamMembers;
    }

    public TotalCommitment getTotalCommitment() {
        return mTotalCommitment;
    }

    public void setTotalCommitment(TotalCommitment totalCommitment) {
        mTotalCommitment = totalCommitment;
    }

}
