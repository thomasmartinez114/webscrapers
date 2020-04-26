package com.company;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

// Tutorial
// https://www.youtube.com/watch?v=tI1qGwhn_bs

public class stockDemo {
	public static void main(String[] args) {
		
		// Site fetching from
		final String url = "https://www.imdb.com/chart/top/";
		
		try {
			final Document doc = Jsoup.connect(url).get();
			
			for (Element row : doc.select(
					"table.chart.full-width tr")) {
				
				final String title = row.select(".titleColumn").text();
				final String rating = row.select(".imdbRating").text();
				
				System.out.println(title + " -> Rating: " + rating);
			}
		}
		catch  (Exception ex) {
			ex.printStackTrace();
		}
	}
}
