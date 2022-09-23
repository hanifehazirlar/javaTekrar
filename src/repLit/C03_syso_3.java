package repLit;

public class C03_syso_3 {
    public static void main(String[] args) {
        /*
        Verilen integer sayilarin Toplamini, carpimini, cikarma islemini ve bolme islemini yapan java kodunu yaziniz.

      num1=100
      num2=25;

     Ornek Cikti:
     125
     2500
     75
     4
         */
        int num1=100;
        int num2=25;
        int toplam=num1+num2;
        int carpim=num1*num2;
        int cikarma=num1-num2;
        int bolme=num1/num2;
        System.out.println(num1+"+"+num2+" = "+toplam);
        System.out.println(num1+"*"+num2+" = "+carpim);
        System.out.println(num1+"-"+num2+" = "+cikarma);
        System.out.println(num1+"/"+num2+" = "+bolme);
    }
}
