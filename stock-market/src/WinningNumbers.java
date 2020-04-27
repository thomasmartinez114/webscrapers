import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class WinningNumbers {
	public static void main(String[] args) {
		
		// Fetch site
		final String url = "https://www.txlottery.org/export/sites/lottery/Games/Lotto_Texas/Winning_Numbers/";
		
		try {
			final Document doc = Jsoup.connect(url).get();
			
			for (Element row : doc.select(
					"table.large-only.rt-responsive-table-0.rt-responsive-table tr")) {
				
				final String drawDate = row.select("td:nth-of-type(1)").text();
				
				//System.out.println(drawDate);
			}
			
			System.out.println(doc.outerHtml());
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
