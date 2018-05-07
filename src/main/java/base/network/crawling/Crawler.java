package base.network.crawling;

import java.util.List;

public interface Crawler <O> {

    List<O> crawl(CrawlInput input);
}
