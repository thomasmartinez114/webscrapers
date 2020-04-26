import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class Demoscrape {
	public static void main(String[] args) throws IOException {
		Document doc = Jsoup.connect("http://example.com/").get();
		System.out.println(doc);
	}
}
 