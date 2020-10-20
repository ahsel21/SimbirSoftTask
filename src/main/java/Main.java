public class Main {
    public static void main(String[] args) {
        DownloaderHtmlPage loader = new DownloaderHtmlPage();
        CleanerHtmlTags cleaenr = new CleanerHtmlTags();
        loader.downloadPage("https://www.simbirsoft.com");
        cleaenr.cleanTags("https://www.simbirsoft.com");
        WordCounter wordCounter = new WordCounter();
        wordCounter.countWord();
    }
}
