package halukHocaPractice.ucusProjesi;

import java.text.DateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;

public class UcusMethods {

    public static void ucusAnaMenu(String adSoyad, String sehir,String varisSehri, int yas, String ucusTuru) {
        System.out.println("===========================================");
        System.out.println("========Java Airlines'e Hosgeldiniz========");
        System.out.println("===========================================");
        double ucretB=500*0.10;
        double ucretC=700*0.10;
        double ucretD=900*0.10;
        double ucret=0;
        switch (varisSehri){
            case "Samsun":ucret=yasKontrol(sehir, varisSehri,yas,ucusTuru,ucretB);
                          biletleme(adSoyad,sehir,varisSehri,yas,ucret,ucusTuru);
                          break;
            case "Ankara":ucret=yasKontrol(sehir, varisSehri,yas,ucusTuru,ucretC);
                          biletleme(adSoyad,sehir,varisSehri,yas,ucret,ucusTuru);
                          break;
            case "Istanbul":ucret=yasKontrol(sehir, varisSehri,yas,ucusTuru,ucretD);
                          biletleme(adSoyad,sehir,varisSehri,yas,ucret,ucusTuru);
                          break;
        }
        System.out.println("Biletiniz Hazirlanmistir");
    }

    private static void biletleme(String adSoyad, String sehir, String varisSehri, int yas, double ucret,String ucusTuru) {
        DateFormat DFormat = DateFormat.getDateInstance();
        Calendar takvim = Calendar.getInstance();
        String guncelTarih = DFormat.format(takvim.getTime());
        int guncelSaat = LocalDateTime.now().getHour();
        int guncelDakika = LocalDateTime.now().getMinute();
        System.out.println("==================================");
        System.out.println("=========Java Airlines============");
        System.out.println("===Rize-Artvin Havalimanı (RZV)===");
        System.out.println("Ucus No : "+ LocalDateTime.now().getYear()+LocalDateTime.now().getHour()+" Kapi Numarasi : "+Math.round(Math.random()*10));
        System.out.println("Islem Tarihi : "+guncelTarih);
        System.out.println("Islem Saati : "+guncelSaat+guncelDakika);
        System.out.println("==================================");
        System.out.println("Kalkis Sehri : "+sehir+ " Varis Sehri : "+varisSehri);
        System.out.println("Musteri Adi : "+adSoyad.toUpperCase());
        System.out.println("Tek Yon/Gidis Donus :" +ucusTuru);
        System.out.println("Yolcu Yasi : "+ yas);
        System.out.println("Toplam Odeme : "+ ucret+"₺");
        System.out.println("==================================");
        System.out.println("=======Iyi Yolculuklar :))========");

    }

    private static double yasKontrol(String sehir, String varisSehri, int yas, String ucusTuru, double ucret) {

        if (ucusTuru.equalsIgnoreCase("GidisDonus")){
            if (yas >0 && yas <12){
                ucret=indirim12YasAlti(ucret);
                ucret=ciftYonIndirim(ucret);
                System.out.println(sehir+" sehrinden "+varisSehri + " şehrine GİDİŞ DÖNÜŞ fiyatınız: " + ucret + "₺");
            }else if (yas>=12 && yas<24){
                ucret=indirim12ve24YasArasi(ucret);
                ucret=ciftYonIndirim(ucret);
                System.out.println(sehir+" sehrinden "+varisSehri + " şehrine GİDİŞ DÖNÜŞ fiyatınız: " + ucret + "₺");

            }else if (yas>65) {
                ucret = indirim65YasUstu(ucret);
                ucret=ciftYonIndirim(ucret);
                System.out.println(sehir+" sehrinden "+varisSehri + " şehrine GİDİŞ DÖNÜŞ fiyatınız: " + ucret + "₺");
            }else {
                ucret=ciftYonIndirim(ucret);
                System.out.println(sehir+" sehrinden "+varisSehri + " şehrine GİDİŞ DÖNÜŞ fiyatınız: " + ucret + "₺");

            }
        }else if (ucusTuru.equalsIgnoreCase("Gidis")){
            if (yas >0 && yas <12){
                ucret=indirim12YasAlti(ucret);
                System.out.println(sehir+" sehrinden "+varisSehri + " şehrine GİDİŞ fiyatınız: " + ucret + "₺");

            }else if (yas>=12 && yas<24){
                ucret=indirim12ve24YasArasi(ucret);
                System.out.println(sehir+" sehrinden "+varisSehri + " şehrine GİDİŞ  fiyatınız: " + ucret + "₺");

            }else if (yas>65) {
                ucret = indirim65YasUstu(ucret);
                System.out.println(sehir+" sehrinden "+varisSehri + " şehrine GİDİŞ  fiyatınız: " + ucret + "₺");
            }else {
                System.out.println("Indirimsiz Yolsu : "+sehir+" sehrinden "+varisSehri + " şehrine GİDİŞ  fiyatınız: " + ucret + "₺");
            }
        }else{
            System.out.println("Gecerli bir yon giriniz");
        }
        return ucret;
    }

    private static double ciftYonIndirim(Double ucret) {
        System.out.println("Gidiş-Dönüş aldığınız için %20 indirim uygulanmistir");
        return ucret*0.8*2;
    }
    private static double indirim65YasUstu(double ucret) {
        System.out.println("65 üstü yaş aralığında olduğunuz için %30 indirim uygulanmistir");
        return ucret*0.7;
    }
    private static double indirim12ve24YasArasi(double ucret) {
        System.out.println("12-24 yaş aralığında olduğunuz için %10 indirim uygulanmistir");
        return ucret*0.9;
    }
    private static double indirim12YasAlti(double ucret) {
        System.out.println("12 yas alti oldugu icin %50 indirim uygulanmistir");
        return ucret/2;
    }
}
