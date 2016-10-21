package com.rapidapi.core.utils;


import java.io.IOException;

/**
 * RapidApi
 */
public class RapidApi
{
    public static void main(String[] args) throws IOException
    {
		String json = "{\"subscriptionKey\": \"57e9164516844d99ae455a9953aca0c2\"," + "\"image\": \"https://i.ytimg.com/vi/tntOCGkgt98/maxresdefault.jpg\"}";
	    RapidApiConnect connect = new RapidApiConnect("qa-project", "481bab2d-e8fe-4214-8714-bab8157356e4");
	    String response = connect.call("MicrosoftComputerVision", "analyzeImage", json);
	    System.out.println(response);
    }
}
