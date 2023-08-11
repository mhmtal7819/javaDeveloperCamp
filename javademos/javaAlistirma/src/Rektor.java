public class Rektor extends Calisan{
    public Rektor(String _ad,String _soyAd,int _tc,String _plan){
        super( _ad, _soyAd, _tc);
        plan=_plan;
    }
    protected String plan;
    protected int gorev;
    public void planOlustur(){
        System.out.println("Plan olustu..");
    }
}
