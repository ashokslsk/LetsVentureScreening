
package com.androidabcd.ashokslsk.letsventurescreening.model;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class TeamMember {

    @SerializedName("admin")
    private Boolean mAdmin;
    @SerializedName("designation")
    private Object mDesignation;
    @SerializedName("founder")
    private Boolean mFounder;
    @SerializedName("id")
    private Long mId;
    @SerializedName("image")
    private String mImage;
    @SerializedName("linkedin_url")
    private String mLinkedinUrl;
    @SerializedName("mobile_short_bio")
    private Object mMobileShortBio;
    @SerializedName("name")
    private String mName;
    @SerializedName("permalink")
    private String mPermalink;
    @SerializedName("pitcher")
    private Boolean mPitcher;
    @SerializedName("team_roles")
    private String mTeamRoles;
    @SerializedName("type")
    private String mType;

    public Boolean getAdmin() {
        return mAdmin;
    }

    public void setAdmin(Boolean admin) {
        mAdmin = admin;
    }

    public Object getDesignation() {
        return mDesignation;
    }

    public void setDesignation(Object designation) {
        mDesignation = designation;
    }

    public Boolean getFounder() {
        return mFounder;
    }

    public void setFounder(Boolean founder) {
        mFounder = founder;
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

    public String getLinkedinUrl() {
        return mLinkedinUrl;
    }

    public void setLinkedinUrl(String linkedinUrl) {
        mLinkedinUrl = linkedinUrl;
    }

    public Object getMobileShortBio() {
        return mMobileShortBio;
    }

    public void setMobileShortBio(Object mobileShortBio) {
        mMobileShortBio = mobileShortBio;
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

    public Boolean getPitcher() {
        return mPitcher;
    }

    public void setPitcher(Boolean pitcher) {
        mPitcher = pitcher;
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
