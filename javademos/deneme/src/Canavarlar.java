public class Canavarlar {
    private String name;
    private static int damage,health,award;
    void setSelect(int id){
        if(id==1){
            setName("Zombi");
            setDamage(3);
            setHealth(10);
            setAward(4);
        }
        if(id==2){
            setName("Vampir");
            setDamage(4);
            setHealth(14);
            setAward(7);
        }
        if(id==3){
            setName("Ayı");
            setDamage(7);
            setHealth(20);
            setAward(12);
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
    void setAward(int _award){
        award=_award;
    }
     static int  getDamage(){
        return damage;
    }
    static int getHealth(){
        return health;
    }
    static int getAward(){
        return award;
    }
    String getName(){return name;}
}
