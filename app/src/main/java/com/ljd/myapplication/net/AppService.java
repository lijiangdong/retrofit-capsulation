package com.ljd.myapplication.net;

import okhttp3.ResponseBody;
import retrofit2.http.GET;
import rx.Observable;

public interface AppService {
    @GET("/app/release/update.json")
    Observable<ResponseBody> checkUpdateApk();
}
