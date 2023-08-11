import java.util.Scanner;

public class Player {
    private int health;
    private int rhealth;
    private int money;
    private int damage;
    private String cname,name;
     Inventory invent;
    Scanner scanner=new Scanner(System.in);
    Player(String name){
        this.name=name;
        this.invent=new Inventory();
    }
    public int TotalDamage(){
        return this.getDamage()+this.getInv().getDamage();
    }

    public void selectCharacter(){
      switch(chaMenu()){
          case 1:
              initPlayer("Samuray",5,21,15);

              break;
          case 2:
              initPlayer("Okcu",7,18,20);

              break;
          case 3:
              initPlayer("Şövalye",8,24,10);

          default:
              initPlayer("Samuray",5,21,15);

              break;
      }
      System.out.println("Karakteriniz olustu...");
    }

    public void initPlayer(String nme,int dmg,int health,int mny){
        setCname(nme);
        setMoney(mny);
        setHealth(health);
        setDamage(dmg);
        setRhealth(health);
    }
    public int chaMenu(){
        System.out.println("Lütfen bir karakter seçiniz: ");
        System.out.println("Karakter <1>: AD: Samuray // HASAR: 5 // SAĞLIK: 21 // PARA: 15");
        System.out.println("Karakter <2>: AD: Okcu // HASAR: 7 // SAĞLIK: 18 // PARA: 20");
        System.out.println("Karakter <3>: AD: Şövalye // HASAR: 8 // SAĞLIK: 24 // PARA: 10");
        System.out.print("Seçiminiz: ");
        int chaId=scanner.nextInt();
        while(chaId<1 || chaId>3){
            System.out.println("Lutfen gecerli bir karakter giriniz: ");
            chaId=scanner.nextInt();
        }

        return chaId;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getHealth(){
        return health;
    }
    public void setHealth(int health){
        this.health=health;
    }

    public void setDamage(int damage){
        this.damage=damage;
    }

    public int getDamage(){
        return damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public int getRhealth() {
        return rhealth;
    }

    public void setRhealth(int rhealth) {
        this.rhealth = rhealth;
    }

    public Inventory getInv() {
        return invent;
    }

    public void setInv(Inventory invent) {
        this.invent=invent;
    }
}
