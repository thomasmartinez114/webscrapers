import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class WinningNumbers {
	public static void main(String[] args) {
		
		// Fetch site
		final String url = "https://www.txlottery.org/export/sites/lottery/Games/Lotto_Texas/Winning_Numbers/";
		
		try {
			final Document doc = Jsoup.connect(url).get();
			System.out.println(doc.outerHtml());
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
