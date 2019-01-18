
package com.androidabcd.ashokslsk.letsventurescreening.model;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class StartUpResponse {

    @SerializedName("startups")
    private List<Startup> mStartups;
    @SerializedName("total_count")
    private Long mTotalCount;
    @SerializedName("uninteracted_count")
    private Object mUninteractedCount;

    public List<Startup> getStartups() {
        return mStartups;
    }

    public void setStartups(List<Startup> startups) {
        mStartups = startups;
    }

    public Long getTotalCount() {
        return mTotalCount;
    }

    public void setTotalCount(Long totalCount) {
        mTotalCount = totalCount;
    }

    public Object getUninteractedCount() {
        return mUninteractedCount;
    }

    public void setUninteractedCount(Object uninteractedCount) {
        mUninteractedCount = uninteractedCount;
    }

}
