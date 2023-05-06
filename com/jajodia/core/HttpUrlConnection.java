package com.jajodia.core;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HttpUrlConnection {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://reqres.in/api/users");
        HttpURLConnection con = (HttpURLConnection)url.openConnection();
        con.setRequestMethod("POST");
        con.setRequestProperty("Content-Type", "application/json");
        con.setRequestProperty("Accept", "application/json");
        con.setDoOutput(true);
//        String jsonInputString = "{"name": "Upendra", "job": "Programmer"}";
//        JSONObject candidateDetail = new JSONObject();
//        candidateDetail.put("userId", currentUser.getUserId());
//        candidateDetail.put("firstName", currentUser.getFirstName());
//        candidateDetail.put("lastName", currentUser.getLastName());
//

    }

}
