import java.io.*;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.apache.commons.io.FileUtils;

public class DownloaderHtmlPage implements Downloader {

    public void downloadPage(String url) {
        try {
            Document doc = Jsoup.connect(url)
                    .userAgent("Chrome/4.0.249.0 Safari/532.5")
                    .referrer("http://www.google.com")
                    .get();
            File file = new File("downloads/downloadedHtml.html");
            FileUtils.writeStringToFile(file, doc.outerHtml());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
