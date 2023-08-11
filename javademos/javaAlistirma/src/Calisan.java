public class Calisan {
    protected String ad,soyAd;
    protected int tc;
    public Calisan(String _ad,String _soyAd,int _tc){
        ad=_ad;
        soyAd=_soyAd;
        tc=_tc;
    }

    public void giris(){
        System.out.println("Giris yapildi !!!");
    }

    public static void girisYapanlar(Calisan[] girisler){
        for(Calisan a:girisler){
           a.giris();
        }
    }
}
