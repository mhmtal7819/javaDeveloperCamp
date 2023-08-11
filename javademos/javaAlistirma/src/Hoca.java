public abstract class Hoca extends Calisan{
    public Hoca(String _ad,String _soyAd, int _tc,String _ders){
        super(_ad,_soyAd,_tc);
        ders=_ders;
    }
    protected String ders;

    public abstract void dersCalis();
}
