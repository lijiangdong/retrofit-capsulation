package com.ljd.myapplication.net;

import java.util.Map;

import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;
import rx.Observable;

public interface AppService {
//    @GET("/app/release/update.json")
    @GET("search/repositories")
    Observable<ResponseBody> checkUpdateApk(@QueryMap Map<String,String> map);
}
