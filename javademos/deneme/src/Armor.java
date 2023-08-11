public class Armor extends Store{
    int health;



    @Override
    void setSelect(int id) {
        if(id==1){
            setName("hafif");
            setMoney(15);
            setHealth(1);
        }
        if(id==2){
            setName("orta");
            setMoney(25);
            setHealth(3);
        }
        if(id==3){
            setName("ağır");
            setMoney(40);
            setHealth(5);
        }
    }

    @Override
    void setMoney(int money) {
    this.money=money;
    }

    @Override
    int getMoney() {
        return money;
    }

    @Override
    void setName(String name) {
        this.name=name;
    }

    @Override
    String getName() {
        return name;
    }

    void setHealth(int health){
        this.health=health;
    }
    int getHealth(){
        return health;
    }
}
