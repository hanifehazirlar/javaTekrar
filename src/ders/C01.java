package ders;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;

public class C01 {
    public static void main(String[] args) {
        DateFormat DFormat = DateFormat.getDateInstance();
        Calendar takvim = Calendar.getInstance();

        String guncelTarih = DFormat.format(takvim.getTime());
        System.out.println(guncelTarih);
        LocalDate date=LocalDate.now();
        System.out.println(date);



        int guncelSaat = LocalDateTime.now().getHour();

        int guncelDakika = LocalDateTime.now().getMinute();


    }
}
