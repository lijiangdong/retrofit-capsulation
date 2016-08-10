package com.ljd.myapplication.net;

import com.ljd.myapplication.CheckUpdateEntity;

import retrofit2.http.GET;
import rx.Observable;

public interface AppService {
    @GET("/app/release/update.json")
    Observable<CheckUpdateEntity> checkUpdateApk();
}
