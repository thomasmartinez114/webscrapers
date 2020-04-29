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
			//System.out.println(doc);
			
			for (Element row : doc.select(
					"table.chart.full-width tr")) {
				final String title = row.select(".titleColumn a").text();
				final String rating = row.select(".imdbRating").text();
				
				System.out.println(title + rating);
			}
			
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		
	}
}
