package com.androidabcd.ashokslsk.letsventurescreening;

import com.androidabcd.ashokslsk.letsventurescreening.model.StartUpResponse;
import retrofit2.Call;
import retrofit2.http.GET;

public interface RequestInterface {
    @GET("v2/5c245c1030000061007a5f72")
    Call<StartUpResponse> getJSON();
}
