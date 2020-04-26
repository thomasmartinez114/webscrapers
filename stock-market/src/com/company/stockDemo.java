package com.company;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

// Tutorial
// https://www.youtube.com/watch?v=tI1qGwhn_bs

public class stockDemo {
	public static void main(String[] args) {
		
		// Site fetching from
		final String url = "https://www.baseball-reference.com/teams/NYY/2019.shtml";
		
		try {
			final Document doc = Jsoup.connect(url).get();
			System.out.println(doc.outerHtml());
		}
		catch  (Exception ex) {
			ex.printStackTrace();
		}
	}
}
