// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       /* String[] adlar=new String[3];
        adlar[0]="ahmet";
        adlar[1]="mehmet";
        adlar[2]="samet";
        for(int i=0;i<adlar.length;i++){
            System.out.println(adlar[i]);
        }

        for(String ad:adlar){
            System.out.println(ad); //aynı seyleri yazar baska bir yontemle
        } */

        double[] numbers={1.2,1.3,1.4};
        double sum=0;
        double max=numbers[0];
        for(double number:numbers){
            sum=sum+number;
            if(number>max){
                max=number;
            }
        }
        System.out.println("Toplamlari= "+sum);
        System.out.println("En buyuk sayi= "+max);
        //u cant sum int with double
        String[][] sehirler=new String[3][3];
        sehirler[0][0]="istanbul";
        sehirler[0][1]="ankara";
        sehirler[0][2]="izmir";
        sehirler[1][0]="bursa";
        sehirler[1][1]="sakarya";
        sehirler[1][2]="karabuk";
        sehirler[2][0]="kastamonu";
        sehirler[2][1]="zonguldak";
        sehirler[2][2]="sinop";

        for(int i=0;i<=2;i++){
            System.out.println("---------");
            for(int j=0;j<=2;j++){
                System.out.println(sehirler[i][j]);
            }
        }

        String mesaj="Fenerbahce sampiyon";
        System.out.println(mesaj.length()); //karakter sayisi (char)
        System.out.println(mesaj.charAt(4)); //5. elemanı basar.
        System.out.println(mesaj.concat("aliii")); //sonuna ekleme yapar
        System.out.println(mesaj.startsWith("F")); //f ile başlama durumu true döndürücek
        System.out.println(mesaj.endsWith("a")); //hangi karakterle bitecek (false dmndurur



    }
}