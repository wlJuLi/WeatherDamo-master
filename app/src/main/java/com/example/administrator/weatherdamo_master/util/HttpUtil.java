package com.example.administrator.weatherdamo_master.util;

import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * 封装okhttp的网络请求
 */
public class HttpUtil {
    public static void sendOkHttpRequest(String address,Callback callback)
    {
        OkHttpClient client=new OkHttpClient();
        Request request=new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
