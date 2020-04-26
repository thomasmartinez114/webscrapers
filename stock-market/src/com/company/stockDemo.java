package com.company;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

// Tutorial
// https://www.youtube.com/watch?v=tI1qGwhn_bs

public class stockDemo {
	public static void main(String[] args) {
		
		// Site fetching from
		final String url = "http://mlb.mlb.com/stats/sortable.jsp#elem=%5Bobject+Object%5D&tab_level=child&click_text=Sortable+Player+hitting&game_type='R'&season=2019&season_type=ANY&league_code='MLB'&sectionType=sp&statType=hitting&page=1&ts=1587933285463";
		
		try {
			final Document doc = Jsoup.connect(url).get();
			System.out.println(doc.outerHtml());
		}
		catch  (Exception ex) {
			ex.printStackTrace();
		}
	}
}
