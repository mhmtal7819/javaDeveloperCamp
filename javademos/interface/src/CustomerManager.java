public class CustomerManager {
    private IcustomerDAI customerdaı;

    public CustomerManager(IcustomerDAI _customerdaı){
        customerdaı=_customerdaı;
    }
    public void add(){
        customerdaı.add();
    }
}
