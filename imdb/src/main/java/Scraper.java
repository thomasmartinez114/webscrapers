import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class Scraper {

    public static void main(String[] args) throws Exception {
        final Document document = Jsoup.connect("https://www.imdb.com/chart/top/").get();
    }
}
