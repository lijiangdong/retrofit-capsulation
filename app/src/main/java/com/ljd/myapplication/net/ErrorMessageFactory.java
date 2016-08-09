package com.ljd.myapplication.net;

import android.content.Context;

import com.ljd.myapplication.R;

import java.net.ConnectException;
import java.net.SocketTimeoutException;

import retrofit2.adapter.rxjava.HttpException;

public class ErrorMessageFactory {

    private ErrorMessageFactory() {

    }

    /**
     * 返回异常信息提示，根据需要自己补充
     * @param context
     * @param exception
     * @return
     */
    public static String create(Context context, Exception exception) {

        String message = context.getString(R.string.exception_message_generic);

        if (exception instanceof ConnectException) {
            message = context.getString(R.string.exception_message_no_connection);
        }else if (exception instanceof SocketTimeoutException){
            message = context.getString(R.string.exception_message_connect_timeout);
        }else if (exception instanceof HttpException){
            message = httpException(exception,context,message);
        }

        return message;
    }

    private static String httpException(Exception e,Context context,String message){

        HttpException httpException = (HttpException)e;

        if (httpException.code() == 504){
            message = context.getString(R.string.exception_message_not_net_connect);
        }

        return message;
    }
}
