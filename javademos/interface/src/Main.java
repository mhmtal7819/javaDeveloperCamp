// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       IcustomerDAI customerdaı=new OracleDAI(); //implement ettiği sınıfları referans alabiliyor
        customerdaı.add(); //classlar birden fazla interface tarafınfan implement edilebilir..

    /*    CustomerManager musteri=new CustomerManager();
        musteri.customerdaı=new SQLDaı();
        musteri.add(); */

        CustomerManager customerManager=new CustomerManager(new SQLDaı());
        customerManager.add();

    }
}