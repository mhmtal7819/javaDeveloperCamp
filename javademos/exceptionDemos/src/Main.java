import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {
       try{
           int[] sayilar=new int[]{1,2,3};
           System.out.println(sayilar[5]);
       }
       catch(Exception exception){
           System.out.println("dizide hata var...");
       }finally{
           System.out.println("ben her turlu calisirim.."); //try veya catch den sonra her turlu calisir
       }

       BufferedReader reader=null;
       int total=0;

       try{
         reader=new BufferedReader(new FileReader("C:\\javademos\\exceptionDemos\\src\\sayi"));
           String line=null;
         while((line=reader.readLine())!=null){
             total=total+Integer.valueOf(line); //line string oldugu icin ınteger degere cevirdik

         }
           System.out.println("sonuc= "+total);
    }catch(Exception exception){
           System.out.println("gecersiz dosya");
       }finally{
           reader.close();
       }
}
}