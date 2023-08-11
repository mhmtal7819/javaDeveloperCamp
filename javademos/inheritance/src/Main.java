// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
      customer musteri=new customer();
      musteri.email="mehmttt"; //gibi
        employee calisan=new employee();
      //  calisan.info();
        salaryCalculate maaslar=new salaryCalculate();
        maaslar.hesaplama(new customer()); //paremetre kısmına person sınıfının kalıtım yaptığı tüm sınıf objeleri koyulabilir.
        person[] kisii=new person[]{new customer(),new employee()};
        for(person kisiler:kisii){
            kisiler.info("Bilgiler islendi: ");

        }
    }
}