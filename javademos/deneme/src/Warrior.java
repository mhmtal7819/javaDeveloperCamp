import java.util.ArrayList;

public class Warrior {
    private String name;
    private int id;
    private static int damage,health,money;
    public ArrayList<String> ganimetler=new ArrayList<>();
    public void setKarakter(int id){
        if(id==1){
            setName("Samuray");
            setDamage(5);
            setHealth(21);
            setMoney(15);
        }
        if(id==2){
            setName("Okcu");
            setDamage(7);
            setHealth(18);
            setMoney(30);
        }
        if(id==3){
            setName("Sovalye");
            setDamage(8);
            setHealth(24);
            setMoney(10);
        }
    }
    void setName(String _name){
        name=_name;
    }
    void setDamage(int _damage){
        damage=_damage;
    }
    void setHealth(int _health){
        health=_health;
    }
    void setMoney(int _money){
        money=_money;
    }
    String getName(){
        return name;
    }
    static int getDamage(){
        return damage;
    }
    static int getHealth(){
        return health;
    }
    static int getMoney(){
        return money;
    }
    void print(){
        System.out.println("Karakter: "+getName());
        System.out.println("Verdigi hasar: "+getDamage());
        System.out.println("Saglık durumu: "+getHealth());
        System.out.println("Parası: "+getMoney());
    }
}
