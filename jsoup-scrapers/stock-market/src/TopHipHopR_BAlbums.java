import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class TopHipHopR_BAlbums {

	public static void main(String[] args) {
		
		// Fetch the site
		final String url = "https://en.wikipedia.org/wiki/Top_R%26B/Hip-Hop_Albums";
		
		try {
			final Document doc = Jsoup.connect(url).get();
			
			for (Element row : doc.select(
					"wikitable.sortable.jquery-tablesorter tr")) {
				
				final String weeks = row.select(".headerSort").text();
				
				System.out.println(weeks);
			}
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
