public class Weapon extends Store{

    int damage;



    @Override
    void setSelect(int id) {
      if(id==1){
          setName("tabanca");
          setMoney(25);
          setDamage(2);
      }
        if(id==2){
            setName("kılıç");
            setMoney(35);
            setDamage(3);
        }
        if(id==3){
            setName("tüfek");
            setMoney(45);
            setDamage(7);
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

    void setName(String _name){
        this.name=_name;
    }

    @Override
    String getName() {
        return name;
    }

    void setDamage(int damage){
        this.damage=damage;
    }
    int getDamage(){return damage;}

}
