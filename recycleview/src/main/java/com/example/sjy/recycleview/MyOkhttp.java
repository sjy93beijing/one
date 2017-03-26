package com.example.sjy.recycleview;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;


/**
 * Created by 盛俊阳 on 2017/216.
 */
public class MyOkhttp {

    public static OkHttpClient client = new OkHttpClient();

    public static String get(String url){
        try {
         client.newBuilder().connectTimeout(10000, TimeUnit.MILLISECONDS);
        Request request = new Request.Builder().url(url).build();
        //respose响应
        Response response = client.newCall(request).execute();
        if (response.isSuccessful()) {
            return response.body().string();
        } else {
            throw new IOException("Unexpected code " + response);
        }
        } catch (IOException e) {

            e.printStackTrace();
        }
        return null;
    }


}
