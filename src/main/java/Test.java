import movies.sources.tw116.Tw116CrawlInput;
import movies.sources.tw116.Tw116Crawler;

public class Test {
    public static void main(String[] args) throws Exception {
        Tw116Crawler tw116Crawler = new Tw116Crawler();
        Tw116CrawlInput input = new Tw116CrawlInput("毒枭");
        System.out.print(tw116Crawler.sendPostRequest(input));
    }
}