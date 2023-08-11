public abstract class GameCalculator {
    public abstract void hesapla(); //bu sayede ınherit edilen classlar bu fonksiyonu override etmek zorunda
    //ayrıca bu sınıflar main icinde objesi olusturulamaz (fonk override edilmek zorunda
    public final void GameOver(){ //kesinlikle override edilemez

        System.out.println("Oyun bitti...");
    }

}
