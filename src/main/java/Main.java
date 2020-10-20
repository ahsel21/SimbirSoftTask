public class Main {
    public static void main(String[] args) {
        DownloaderHtmlPage loader = new DownloaderHtmlPage();
        CleanerHtmlTags cleaenr = new CleanerHtmlTags();
        loader.downloadPage("https://overthewire.org/wargames/bandit/");
        cleaenr.htmlToText("https://overthewire.org/wargames/bandit/");
    }
}
