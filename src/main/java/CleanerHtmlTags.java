import org.apache.commons.io.FileUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.File;
import java.io.IOException;

public class CleanerHtmlTags implements Cleaner {
    public void cleanTags(String url){
        try {
            Document document = Jsoup.connect(url).get();
            File file = new File("downloads/htmlWithoutTags.html");
            FileUtils.writeStringToFile(file, document.text().replaceAll("\\<.*?\\>", ""));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
