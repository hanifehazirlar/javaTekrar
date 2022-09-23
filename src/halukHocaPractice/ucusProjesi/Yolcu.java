package halukHocaPractice.ucusProjesi;

public class Yolcu {
    private String adSoyad;
    private String sehir;
    private String varisSehri;
    private int yas;
    private String ucusTuru;


    public Yolcu(String adSoyad, String sehir, String varisSehri, int yas, String ucusTuru) {
        this.adSoyad = adSoyad;
        this.sehir = sehir;
        this.varisSehri = varisSehri;
        this.yas = yas;
        this.ucusTuru = ucusTuru;
    }

    public Yolcu() {
    }

    public String getVarisSehri() {
        return varisSehri;
    }

    public void setVarisSehri(String varisSehri) {
        this.varisSehri = varisSehri;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getSehir() {
        return sehir;
    }

    public void setSehir(String sehir) {
        this.sehir = sehir;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public String getUcusTuru() {
        return ucusTuru;
    }

    public void setUcusTuru(String ucusTuru) {
        this.ucusTuru = ucusTuru;
    }
}
