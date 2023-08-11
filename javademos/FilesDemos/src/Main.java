import java.io.*;

import java.util.Scanner;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

                 createFile();
                 writeFile();
                 getFileInfo();
                 readFile();
    }
    public static void createFile(){
        File file=new File("C:\\javademos\\Files\\students.txt");
        try {
            if(file.createNewFile()){
                System.out.println("dosya olusturuldu");//var olup olmadıgını anlamak adına try catch e ihtiyacı var
            }
            else{
                System.out.println("zaten mevcut dosya");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void getFileInfo(){
        File file=new File("C:\\javademos\\Files\\students.txt");
        if(file.exists()){ //dosya var mı yok mu
            System.out.println("Dosya adi: "+file.getName());
        }
    }

    public static void readFile(){
        File file=new File("C:\\javademos\\Files\\students.txt");
        try {
            Scanner reader=new Scanner(file);
            while(reader.hasNextLine()){
                String line= reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) { //dosya var mı yok mu yoklama
            throw new RuntimeException(e);
        }
    }

    public static void writeFile(){
        try {
            BufferedWriter writer=new BufferedWriter(new FileWriter("C:\\javademos\\Files\\students.txt",true));
            //bu dosyanın üstüne yazar ekleme için sonuna true eklemek lazım
            writer.newLine(); //bunda yeni satır olusturur oyle ekler
            writer.write("ahmet");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}