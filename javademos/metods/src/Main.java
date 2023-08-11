// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println(topla(1,2,3));
        PublicManager musteri=new PublicManager();
        musteri.ekle();
        int x=5;
        int y=6;
        calculator hesapp=new calculator();
        hesapp.hesap(x,y);

    }
    public static int topla(int...sayilar){ //istedigin kadar sayi ekleyebilirsin
        int toplam=0;
        for(int sayi:sayilar){
            toplam=toplam+sayi;
        }
        return toplam;
    }
}