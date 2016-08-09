package com.ljd.myapplication.net;

import rx.Scheduler;
import rx.android.schedulers.AndroidSchedulers;

public class UIThread implements PostExecutionThread {

    private static UIThread sUiThread;

    private UIThread(){

    }

    public static UIThread getInstance(){
        if (sUiThread == null){
            synchronized (UIThread.class){
                if (sUiThread == null){
                    sUiThread = new UIThread();
                }
            }
        }
        return sUiThread;
    }

    @Override
    public Scheduler getScheduler() {
        return AndroidSchedulers.mainThread();
    }
}
