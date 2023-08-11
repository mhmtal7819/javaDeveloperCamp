import java.util.Scanner;
public class ProductManager {
  //  ProductInvalid invalid=new ProductInvalid();
    public void Manager(product _urun){

        if(ProductInvalid.Invalid(_urun)){ //static fonk sayesinde class adıyla fonk cağırabildik
            System.out.println("urun eklendi");
        }
        else{
            System.out.println("gecersiz urun");
        }

        Scanner scanner=new Scanner(System.in);
        System.out.println("Adınız: ");
        String isim=scanner.nextLine();
        System.out.println("Merhaba "+isim); //kullanıcıdan değer alma
    }
}
