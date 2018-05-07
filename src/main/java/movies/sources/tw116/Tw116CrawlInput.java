package movies.sources.tw116;

import base.network.crawling.CrawlInput;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class Tw116CrawlInput implements CrawlInput {
    private static String MAIN_URI = "http://www.tw116.com";
    private static String SEARCH_HREF = "/index.php?s=vod-search";

    private final String keyword;

    public Tw116CrawlInput(
            String keyword
    ) {
        this.keyword=keyword;
    }

    public URL getUrl() throws MalformedURLException {
        return new URL(MAIN_URI + SEARCH_HREF);
    }

    public String getKeyword() {
        return keyword;
    }
}
