import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        War war=new War();
        Warrior warrior=new Warrior();
        System.out.print("Karakter numarasını sec: ");
        int id=scanner.nextInt();
        warrior.setKarakter(id);
        warrior.print();

        System.out.println("------------");
        int placeid;
        do {
            System.out.print("Mekanı secin: ");
            placeid = scanner.nextInt();
            Places place = new Places();
            place.setPlace(placeid);
            place.print();
            System.out.println("------------");

            System.out.println("Savaş başladı..");
            war.war();
            System.out.println("------------");

        }while(placeid!=6);

    }
}