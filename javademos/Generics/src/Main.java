import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ArrayList objeler=new ArrayList();
        objeler.add("ankara");
        objeler.add(1);  //bu sekılde istedıgımız turden atama yapabılıyoruz

        ArrayList<String> sehirler=new ArrayList<>(); //sadece string turunden
        MyList<String> isimler=new MyList<>(); //array clası olusturduk
        Customer customer=new Customer(1,"mehmet");
        MyList<Customer> musteriler=new MyList<>(); //olusturdugumuz classın objelerini ekleriz
        musteriler.add(customer);
        musteriler.add(new Customer(2,"ahmet"));

    }
}