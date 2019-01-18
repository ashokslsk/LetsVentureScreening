
package com.androidabcd.ashokslsk.letsventurescreening.model;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class CommitedInvestor {

    @SerializedName("committed_at")
    private Long mCommittedAt;
    @SerializedName("designation")
    private String mDesignation;
    @SerializedName("id")
    private Long mId;
    @SerializedName("image")
    private String mImage;
    @SerializedName("investment_privacy")
    private Boolean mInvestmentPrivacy;
    @SerializedName("investor")
    private Boolean mInvestor;
    @SerializedName("is_lead")
    private Boolean mIsLead;
    @SerializedName("linkedin_url")
    private String mLinkedinUrl;
    @SerializedName("lv_roles")
    private String mLvRoles;
    @SerializedName("name")
    private String mName;
    @SerializedName("permalink")
    private String mPermalink;
    @SerializedName("recommendations")
    private List<Object> mRecommendations;
    @SerializedName("team_roles")
    private String mTeamRoles;
    @SerializedName("type")
    private String mType;

    public Long getCommittedAt() {
        return mCommittedAt;
    }

    public void setCommittedAt(Long committedAt) {
        mCommittedAt = committedAt;
    }

    public String getDesignation() {
        return mDesignation;
    }

    public void setDesignation(String designation) {
        mDesignation = designation;
    }

    public Long getId() {
        return mId;
    }

    public void setId(Long id) {
        mId = id;
    }

    public String getImage() {
        return mImage;
    }

    public void setImage(String image) {
        mImage = image;
    }

    public Boolean getInvestmentPrivacy() {
        return mInvestmentPrivacy;
    }

    public void setInvestmentPrivacy(Boolean investmentPrivacy) {
        mInvestmentPrivacy = investmentPrivacy;
    }

    public Boolean getInvestor() {
        return mInvestor;
    }

    public void setInvestor(Boolean investor) {
        mInvestor = investor;
    }

    public Boolean getIsLead() {
        return mIsLead;
    }

    public void setIsLead(Boolean isLead) {
        mIsLead = isLead;
    }

    public String getLinkedinUrl() {
        return mLinkedinUrl;
    }

    public void setLinkedinUrl(String linkedinUrl) {
        mLinkedinUrl = linkedinUrl;
    }

    public String getLvRoles() {
        return mLvRoles;
    }

    public void setLvRoles(String lvRoles) {
        mLvRoles = lvRoles;
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

    public List<Object> getRecommendations() {
        return mRecommendations;
    }

    public void setRecommendations(List<Object> recommendations) {
        mRecommendations = recommendations;
    }

    public String getTeamRoles() {
        return mTeamRoles;
    }

    public void setTeamRoles(String teamRoles) {
        mTeamRoles = teamRoles;
    }

    public String getType() {
        return mType;
    }

    public void setType(String type) {
        mType = type;
    }

}
