import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
      Scanner scanner=new Scanner(System.in);
      Warrior warrior=new Warrior();
      System.out.print("Karakter numarasını sec: ");
      int id=scanner.nextInt();
      warrior.setKarakter(id);
      warrior.print();
    }
}