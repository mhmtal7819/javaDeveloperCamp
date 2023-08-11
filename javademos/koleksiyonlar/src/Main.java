import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        ArrayList sayilar=new ArrayList();
        sayilar.add(1);
        sayilar.add(2);
        sayilar.add("ankara");
        System.out.println(sayilar.size()); //kac adet eleman oldugunu soyler
        sayilar.set(2,100); //3. elemanı 100 yaptı
        sayilar.remove(0); //ilk elemanı kaldırdı
        //sayilar.clear(); //tum elemanları sildi
        System.out.println(sayilar.get(1));
        for(Object i:sayilar){
            System.out.println(i);
        }
        ArrayList<String> objeler=new ArrayList(); //sadece string değişkenler eklenir.
        objeler.add("istanbul");
        objeler.add("ankara");
        Collections.sort(objeler); //alfabetik sıraya soktu

        ArrayList<Customer> musteriler=new ArrayList<Customer>();
         musteriler.add(new Customer(1,"mehmet","yılmaz")); //bu sekılde kullanabilirsin
        Customer mehmet=new Customer(3,"mehmetali","sade");
        musteriler.add(mehmet); //3. kisi eklendi
        musteriler.remove(mehmet); //3. kisi kaldırıldı
        musteriler.add(new Customer(2,"banu","yılmaz"));


        for(Customer musteri:musteriler){
            System.out.println(musteri.id);
        }

        HashMap<String, Integer> hashMap=new HashMap<String, Integer>();
        hashMap.put("mehmet",90);
        hashMap.put("berre",55);
        System.out.println(hashMap); //sozluk gıbı eşleştirme yapmada kullanılır
        System.out.println(hashMap.get("mehmet")); //mehmet karsılık gelen değerı bastırır


    }
}