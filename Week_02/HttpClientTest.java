package NioTest;

import okhttp3.*;


import java.io.IOException;

/**
 * @author Wu YuHao thecoco
 * @date 2020/10/28 3:01 下午
 */
public class HttpClientTest {
    public static void main(String[] args) {
        String url = "http://localhost:8801";
        OkHttpClient okHttpClient = new OkHttpClient();
        final Request request = new Request.Builder()
                .url(url)
                .get()
                .build();
        final Call call = okHttpClient.newCall(request);
//        new Thread(() -> {
//            try {
//                Response response = call.execute();
//                System.out.println("response" + response.body().string());
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }).start();
        try {
            Response response = call.execute();
            System.out.println(response.body().string());
        } catch (IOException e) {
            e.printStackTrace();
        }
        }
//    private static final OkHttpClient OK_HTTP_CLIENT = new OkHttpClient();
//
//    public static void main(String[] args) {
//        HttpClientTest.get("http://192.168.199.122:8081");
//    }
//
//    private static void get(String url){
//        Request request = new Request.Builder().url(url).get().build();
//        Call call = OK_HTTP_CLIENT.newCall(request);
//        try {
//            Response response = call.execute();
//            System.out.println(response.body().string());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
    }

