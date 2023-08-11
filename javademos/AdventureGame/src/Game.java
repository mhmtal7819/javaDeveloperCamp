import java.util.Scanner;

public class Game {
    Player player;
    Location location;
    Scanner scan =new Scanner(System.in);

    public void login(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Oyuna hoşgeldiniz...");
        System.out.print("Adınız: ");
        String name=scan.nextLine();
        player=new Player(name);
        player.selectCharacter();
        start();
    }

    public void start(){
        while(true) {
            System.out.println();
            System.out.println("-----------");
            System.out.println();
            System.out.println("Lutfen mekanı seciniz-> ");
            System.out.println("1>Guvenli ev: Düsman yok");
            System.out.println("2>Nehir: Ayı çıkabilir");
            System.out.println("3>Magara: Zombi çıkabilir");
            System.out.println("4>Orman: Vampir çıkabilir..");
            System.out.println("5>Magaza: Silah veya zırh alınabilir");
            System.out.println("Gitmek istediginiz yer: ");
            int locId = scan.nextInt();
            while (locId < 0 || locId > 5) {
                System.out.println("Lutfen gecerli bir mekan seciniz: ");
                locId = scan.nextInt();
            }
            switch (locId) {
                case 1:
                    location = new SafeHouse(player);
                    break;
                case 2:
                    location=new Nehir(player);
                    break;
                case 3:
                    location=new Magara(player);
                    break;
                case 4:
                    location=new Forest(player);
                    break;
                case 5:
                    location = new ToolStore(player);
                    break;
                default:
                    location = new SafeHouse(player);
                    break;
            }
            if(location.getClass().getName().equals("SafeHouse")){
                if(player.getInv().isFood() && player.getInv().isWater() && player.getInv().isFirewood()){
                    System.out.println("Tebrikler Oyunu kazandınız ");
                    break;
                }
            }
            if (!location.getLocation()) {
                System.out.println("Oyun bitti");

            }
        }
    }
}
