public class UrunEkleme {
    public int fiyat;
    public String ad;
    private int seriNo; //sadece bu sınıfta kullanılır
    protected String marka; //kalıtım edilen sınıflar erişebilir
    private static int counter=0;

    UrunEkleme(int _fiyat, String _ad) {
        fiyat = _fiyat;
        ad = _ad;
        UrunEkleme.counter++;

    }
    public static void UrunEkle(){

    }
}
