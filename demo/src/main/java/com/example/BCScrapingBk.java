package com.example;
import java.io.IOException;
import java.util.Iterator;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;



public class BCScrapingBk {
    public void BCScrape(String[] args) throws IOException {
        Document doc = Jsoup.connect("https://www.booking.com/city/br/balneario-de-camboriu.pt-br.html?ws=;aid=1702940;label=balneario-de-camboriu-UE1xDTiSM8tTPzjy6h6Y9AS438016279824%3Apl%3Ata%3Ap1%3Ap2%3Aac%3Aap%3Aneg%3Afi%3Atikwd-6817041114%3Alp1001701%3Ali%3Adec%3Adm%3Appccp%3DUmFuZG9tSVYkc2RlIyh9YcpDr58xwogAwmVmCRFhsnQ;gclid=Cj0KCQiAq5meBhCyARIsAJrtdr5-2GxxpKlXeYRI95ofodr6VkHZ7wukuk-Ujv_Lq7PsmgPJe1jYddoaAll8EALw_wcB")
            .timeout(6000)
            .get();

        Elements hotelName = doc.getElementsByClass("bui-card__title");
        Elements price = doc.getElementsByClass("bui-price-display__value bui-f-color-constructive");

        Iterator<Element> itePrice = price.iterator();
        Iterator<Element> ite = hotelName.iterator();

        System.out.println(ite.next().text());
        System.out.println(itePrice.next().text());
        ite.next();
        System.out.println(ite.next().text());
        System.out.println(itePrice.next().text());
        ite.next();
        System.out.println(ite.next().text());
        System.out.println(itePrice.next().text());
        ite.next();
        System.out.println(ite.next().text());
        System.out.println(itePrice.next().text());
        ite.next();
        System.out.println(ite.next().text());
        System.out.println(itePrice.next().text());
        ite.next();
        System.out.println(ite.next().text());
        System.out.println(itePrice.next().text());
        ite.next();
        System.out.println(ite.next().text());
        System.out.println(itePrice.next().text());
        ite.next();
        System.out.println(ite.next().text());
        System.out.println(itePrice.next().text());
        ite.next();
        System.out.println(ite.next().text());
        System.out.println(itePrice.next().text());
        ite.next();
        System.out.println(ite.next().text());
        System.out.println(itePrice.next().text());
        

       
        

        

    }
}
