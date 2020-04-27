package com.company;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

// Tutorial
// https://www.youtube.com/watch?v=tI1qGwhn_bs

public class topRapAlbums {
	public static void main(String[] args) {
		
		// Site fetching from
		final String url = "https://rateyourmusic.com/list/theu003/top-250-rap-albums-of-all-time/";
		
		try {
			final Document doc = Jsoup.connect(url).get();
			
			for (Element row : doc.select(
					"table.user_list tr")) {
				
				final String artist = row.select(".list_artist").text();
				
				System.out.println("Artist: " + artist);
			}
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
