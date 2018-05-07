package base.network.crawling;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public interface CrawlInput {
    URL getUrl() throws MalformedURLException;
    String getKeyword();
}
