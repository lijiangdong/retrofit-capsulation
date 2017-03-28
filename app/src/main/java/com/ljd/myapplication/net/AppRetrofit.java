package com.ljd.myapplication.net;

import android.text.TextUtils;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class AppRetrofit {

    private static final String Base_URL = "https://api.github.com/";
    private volatile static Retrofit retrofit;

    private AppRetrofit(){

    }

    public static <T> T getNewsRetrofit(Class<T> clazz) {

        if (retrofit == null){
            synchronized (AppRetrofit.class){
                if (retrofit == null){
                    retrofit = new Retrofit.Builder()
                            .baseUrl(Base_URL)
                            .client(getOKHttpClient())
                            .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                            .addConverterFactory(GsonConverterFactory.create())
                            .build();
                }
            }
        }

        return retrofit.create(clazz);
    }

    private static OkHttpClient getOKHttpClient(){
        return new OkHttpClient.Builder()
                .connectTimeout(1000, TimeUnit.MILLISECONDS)
                .build();
    }
}
