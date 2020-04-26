import java.io.IOException;
import java.io.File;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Demoscrape {
	public static void main(String[] args) throws IOException {
		File input = new File("C:\\Users\\tmartinez.MYIGT\\OneDrive - IGT PLC\\My Docs\\Azure Repos\\GNIE_build\\main\\index.html");
		Document doc = Jsoup.parse(input, "UTF-8", "");
		
		System.out.println(doc);
	}
}
 