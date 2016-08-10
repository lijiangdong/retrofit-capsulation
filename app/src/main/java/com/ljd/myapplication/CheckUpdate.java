package com.ljd.myapplication;

import com.ljd.myapplication.net.RetrofitServiceFactory;
import com.ljd.myapplication.net.UseCase;

import java.util.Map;

import rx.Observable;

public class CheckUpdate extends UseCase {

    private final Map<String,String> map;

    public CheckUpdate(Map<String, String> map) {
        this.map = map;
    }

    @Override
    protected Observable buildUseCaseObservable() {
        return RetrofitServiceFactory.getAppService().checkUpdateApk(map);
    }
}
