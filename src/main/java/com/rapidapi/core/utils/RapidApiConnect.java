package com.rapidapi.core.utils;

import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Credentials;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class RapidApiConnect {
  public static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
  private final OkHttpClient client;
  private final String project;
  private final String key;

  public RapidApiConnect(String project, String key) {
    this.client = new OkHttpClient();
    this.project = project;
    this.key = key;
  }

  /**
  * Returns the base URL for block calls
  *
  * @return string Base URL for block calls
  */
  private static final String getBaseUrl()
  {
    return "https://rapidapi.io/connect";
  }

  /**
  * Build a URL for a block call
  *
  * @param pack Package where the block is
  * @param block Block to be called
  * @return string Generated URL
  */
  public static String blockUrlBuild(String pack, String block)
  {
    return RapidApiConnect.getBaseUrl() + "/" + pack + "/" + block;
  }

  /**
  * Call a block
  *
  * @param pack Package of the block
  * @param block Name of the block
  * @param args Arguments to send to the block (JSON)
  * @return string
  */
  public String call(String pack, String block, String args) throws IOException {
    RequestBody body = RequestBody.create(JSON, args);
    Request request = new Request.Builder()
        .url(RapidApiConnect.blockUrlBuild(pack, block))
        .addHeader("User-Agent", "RapidAPIConnect_Java") 
        .addHeader("Authorization", Credentials.basic(this.project, this.key)) 
        .post(body)
        .build();
    try (Response response = this.client.newCall(request).execute()) {
      return response.body().string();
    }
  }

}