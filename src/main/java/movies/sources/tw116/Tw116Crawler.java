package movies.sources.tw116;

import base.network.crawling.CrawlInput;
import base.network.crawling.Crawler;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;

public class Tw116Crawler <MovieInfo> implements Crawler {
    private final String USER_AGENT = "Mozilla/5.0";

    public List<MovieInfo> crawl(CrawlInput input) {
        return new ArrayList<MovieInfo>();
    }

    public String sendPostRequest(CrawlInput input) throws IOException {
        HttpURLConnection con = (HttpURLConnection) input.getUrl().openConnection();

        //add reuqest header
        con.setRequestMethod("POST");
        con.setRequestProperty("User-Agent", USER_AGENT);
        con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");

        // Send post request
        con.setDoOutput(true);
        DataOutputStream wr = new DataOutputStream(con.getOutputStream());
        wr.writeBytes("x=name&kw="+input.getKeyword()+"&submit=影片搜索");
        wr.flush();
        wr.close();

        int responseCode = con.getResponseCode();
        System.out.println("\nSending 'POST' request to URL : " + input.getUrl());
        System.out.println("Post parameters : " + "x=name&kw="+input.getKeyword()+"&submit=影片搜索");
        System.out.println("Response Code : " + responseCode);

        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuilder response = new StringBuilder();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        return response.toString();
    }
}
