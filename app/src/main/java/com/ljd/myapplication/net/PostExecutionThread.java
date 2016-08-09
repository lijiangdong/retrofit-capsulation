package com.ljd.myapplication.net;

import rx.Scheduler;

public interface PostExecutionThread {
    Scheduler getScheduler();
}
