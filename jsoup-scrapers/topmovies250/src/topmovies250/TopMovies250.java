package topmovies250;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class TopMovies250 {
	public static void main(String[] args) {
		
		final String url = "https://www.imdb.com/chart/top/";
		
		try {
			final Document doc = Jsoup.connect(url).get();
			// Print out the whole get() of site
			System.out.println(doc);
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		
	}
}
