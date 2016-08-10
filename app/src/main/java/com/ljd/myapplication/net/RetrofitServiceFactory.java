package com.ljd.myapplication.net;

/**
 * 根据不同功能模块返回不同的Service接口对象
 */
public class RetrofitServiceFactory {
    private static final String Base_URL = "https://api.github.com/";

    public static AppService getAppService(){
        return AppRetrofit.getNewsRetrofit(AppService.class,Base_URL);
    }
}
