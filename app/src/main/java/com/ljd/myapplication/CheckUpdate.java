package com.ljd.myapplication;

import com.ljd.myapplication.net.RetrofitServiceFactory;
import com.ljd.myapplication.net.UseCase;

import rx.Observable;

public class CheckUpdate extends UseCase {

    @Override
    protected Observable buildUseCaseObservable() {
        return RetrofitServiceFactory.getAppService().checkUpdateApk();
    }
}
