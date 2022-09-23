package halukHocaPractice.ucusProjesi;

public class JavaAirlines {
    /*
    Uçuş Projesi;

   1- Constructor kullanarak yolcu üretiyoruz, yolcu bilgilerini scanner ile değil,
      constructor'dan gelen encapsulated bilgilerle elde ediyoruz,
   2- method class'ından ucus() methodunu çağırıp,  içerisinde kullanacğımız değerleri getter method ile ekliyoruz.
   3- bilet yazdırmadan hemen önce, indirimden faydalanmışsan onu belirten bir dinamik sout gönderiyor.
      faydalanmamışsan indirimsiz yolcu + ödenecek tutar yazdırıyor
   4- bilet yazdırırken Flight No ve Gate Number dinamik olarak oluşturulmuştur.
      flight no oluşturma şekli: bulduğumuz seneyi alıyor2022 + bulunduumuz saati alıyor concat edip yazdırıyor .
      Gate number oluşturma şekli:  gidilecek şehir ismi + mathrandom(10)
     */
     /*
    A şehrinden uçmak isteyen bir yolcu B şehrine 500km C şehrine  700km  D şehrine  900 km mesafededir.
    Bilet tarifesi:
    km birim fiyati : 0.10$
    yolcu 12 yasindan kucukse toplam fiyat %50 indirim,
    12 ve 24 yas arasindaysa 10% indirim,
    65 yasindan buyukse 30% indirim,
    bilet gidis donus alinirrsa 20% indirim uygulayan bi app create ediniz
     */
    public static void main(String[] args) {

        Yolcu yolcu1=new Yolcu("Hanife H.","Rize","Samsun",40,"GidisDonus");
        UcusMethods.ucusAnaMenu(yolcu1.getAdSoyad(),yolcu1.getSehir(), yolcu1.getVarisSehri(), yolcu1.getYas(),yolcu1.getUcusTuru());


        Yolcu yolcu2=new Yolcu("Oğuz Hamza H.","Rize","Istanbul",11,"GidisDonus");
        UcusMethods.ucusAnaMenu(yolcu2.getAdSoyad(),yolcu2.getSehir(), yolcu2.getVarisSehri(), yolcu2.getYas(),yolcu2.getUcusTuru());

    }
}
