package com.takeoff.checkurlstatus;
import java.net.HttpURLConnection;
import java.net.URL;
public class CheckURLStatus {
    public static int checker(String url){
        try {
            HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
            connection.setConnectTimeout(30000);
            connection.setReadTimeout(60000);
            connection.setRequestMethod("HEAD");
            return connection.getResponseCode();
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }
}
