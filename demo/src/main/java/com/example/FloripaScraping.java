package com.example;
import java.io.IOException;
import java.util.Iterator;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class FloripaScraping {
    public void FPScrape(String[] args) throws IOException {
        Document doc = Jsoup.connect("https://www.booking.com/searchresults.pt-br.html?label=balneario-de-camboriu-UE1xDTiSM8tTPzjy6h6Y9AS438016279824%3Apl%3Ata%3Ap1%3Ap2%3Aac%3Aap%3Aneg%3Afi%3Atikwd-6817041114%3Alp1001701%3Ali%3Adec%3Adm%3Appccp%3DUmFuZG9tSVYkc2RlIyh9YcpDr58xwogAwmVmCRFhsnQ&sid=ec3f1451ee371134608f6e1c23970e21&aid=1702940&ss=Florian%C3%B3polis%2C+Santa+Catarina%2C+Brazil&ssne=Itapema&ssne_untouched=Itapema&lang=pt-br&src=searchresults&dest_id=-643337&dest_type=city&ac_position=0&ac_click_type=b&ac_langcode=en&ac_suggestion_list_length=5&search_selected=true&search_pageview_id=773d68a38fa2080a&ac_meta=GhA3NzNkNjhhMzhmYTIwODBhIAAoATICZW46BEZsb3JAAEoAUAA%3D&checkin=2023-02-20&checkout=2023-02-21&group_adults=2&no_rooms=1&group_children=0&sb_travel_purpose=leisure&nflt=mealplan%3D1")
            .timeout(6000)
            .get();

        Elements hotelName = doc.getElementsByClass("fcab3ed991 a23c043802");
        Elements price = doc.getElementsByClass("fcab3ed991 fbd1d3018c e729ed5ab6");

        Iterator<Element> itePrice = price.iterator();
        Iterator<Element> ite = hotelName.iterator();

        System.out.println(ite.next().text());
        System.out.println(itePrice.next().text());
        System.out.println(ite.next().text());
        System.out.println(itePrice.next().text());
        System.out.println(ite.next().text());
        System.out.println(itePrice.next().text());
        System.out.println(ite.next().text());
        System.out.println(itePrice.next().text());
        System.out.println(ite.next().text());
        System.out.println(itePrice.next().text());
        System.out.println(ite.next().text());
        System.out.println(itePrice.next().text());
        System.out.println(ite.next().text());
        System.out.println(itePrice.next().text());
        System.out.println(ite.next().text());
        System.out.println(itePrice.next().text());
        System.out.println(ite.next().text());
        System.out.println(itePrice.next().text());
        System.out.println(ite.next().text());
        System.out.println(itePrice.next().text());

    }
}
