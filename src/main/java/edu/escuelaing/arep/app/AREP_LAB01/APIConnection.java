package edu.escuelaing.arep.app.AREP_LAB01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 *
 * @author Yeison Barreto
 */
public class APIConnection {

    private static final String USER_AGENT = "Mozilla/5.0";
    
    public static String requestTitle(String title, String URL) throws IOException {
        
        Cache cache = Cache.getInstance();
        if (cache.isOnCache(title)){
            return cache.getMovieDescription(title);
        }
        
        URL obj = new URL(URL);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("User-Agent", USER_AGENT);
        
        //The following invocation perform the connection implicitly before getting the code
        int responseCode = con.getResponseCode();
        System.out.println("GET Response Code :: " + responseCode);
        
        if (responseCode == HttpURLConnection.HTTP_OK) { // success
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            // print result
            String finalResponse = "["+response.toString()+"]";
            cache.addMovie(title, URL);
            return finalResponse;
        } else {
            System.out.println("GET request not worked");
        }
        System.out.println("GET DONE");
        return "Failed";
    }

}