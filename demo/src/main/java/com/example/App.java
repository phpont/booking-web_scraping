package com.example;
import java.io.IOException;
import java.util.Scanner;


public class App {
     
    public static void main(String[] args) throws IOException {
        
        String[] cidades = {"Balneario Camboriu", "Florianopolis"};
        
        Scanner usrinput = new Scanner(System.in);
        BCScrapingBk bc = new BCScrapingBk();
        FloripaScraping fp = new FloripaScraping();

        try {
            System.out.println("Which city will you be staying in?");
            for (String cid : cidades) {
                System.out.println(cid);
            }
            String city = usrinput.nextLine();

            if (city.equals(cidades[0])) {
                System.out.println("These are the Hotels Available in Balneario Camboriu through booking.com and their respective prices");
                bc.BCScrape(args);
            } else if (city.equals(cidades[1])) {
                System.out.println("These are the Hotels Available in Florianopolis through booking.com and their respective prices");
                fp.FPScrape(args);

            }


        }
        finally {
            usrinput.close();
        }
        
        
        
        
    
    
    }
             
            
    }

