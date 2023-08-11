// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        WomanCalculator woman=new WomanCalculator();
        woman.hesapla();
        GameCalculator game=new ManCalculator();
        game.hesapla();
        OptionManager option=new OptionManager();
        option.oyun=new KidCalculator(); //bu sayede option sınıfı sayesinde istediğimiz kullanıcıya geçiş yapabiliriz
        option.Option();

    }
}