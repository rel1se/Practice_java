package practice23_24;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class htmlParser {
    private static String urlPath = "https://www.mirea.ru";
    public static void main(String[] args){
        try{
            Document doc = Jsoup.connect(urlPath).get();
            Elements imgs = doc.select("img");
            for (Element el:imgs){
                String link = el.attr("abs:src");
                if ((!link.equals("")) && (link.contains("jpg") || link.contains("jpeg") || link.contains("png") || link.contains("svg") || link.contains("webp") || link.contains("gif"))){
                    System.out.println(link);

                    String name = link.substring(link.lastIndexOf("/") + 1);
                    URL url = new URL(link);
                    InputStream in = url.openStream();
                    Files.copy(in, Paths.get("/Users/vyacheslavbotoev/IdeaProjects/projectr_one/src/practice23_24/htmlParser/img" + name), StandardCopyOption.REPLACE_EXISTING);
                    in.close();

                }
            }

        }
        catch (Exception e){

        }
    }
}