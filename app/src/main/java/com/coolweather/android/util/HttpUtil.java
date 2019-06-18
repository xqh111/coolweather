package com.coolweather.android.util;

/**
 * Created by 123 on 2019/6/18.
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String address,okhttps.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
