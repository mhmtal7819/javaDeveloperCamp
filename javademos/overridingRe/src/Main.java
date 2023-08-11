// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        BaseKredi[] kredi=new BaseKredi[]{new OgrenciKredi(),new OgretmenKredi(), new TarımKredi()};
        for(BaseKredi krediler:kredi){
            System.out.println(krediler.KrediHesapla(1000));
            //ogrencikredisi farklı oldugu icin override kullandık
            //eğer bir fonk.nun override yapılmasını istemiyorsanız "public final void.." seklinde yazılmalıdır
        }
    }
}