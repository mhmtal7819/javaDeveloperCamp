public class War {

    static Warrior warrior=new Warrior();
  //  Canavarlar canavar=new Canavarlar();

    static int WarriorHealth(){
        return Warrior.getHealth() - Canavarlar.getDamage();
    }

    static int EnemiesHealth(){
        return Canavarlar.getHealth()-Warrior.getDamage();
    }

    static int WarriorsMoney(){
        return Warrior.getMoney()+Canavarlar.getAward();

    }
    void war(){
        System.out.println("Son durum: ");
       EnemiesHealth();
       System.out.println("Canınız: "+WarriorHealth());
       System.out.println("Para durumu: "+WarriorsMoney());
        if(EnemiesHealth()<=0){
            System.out.println("Tebrikler canavari yendiniz "+Places.getAward()+ "ve "+Canavarlar.getAward()+ " kazandınız");
            warrior.ganimetler.add(Places.getAward());
            WarriorsMoney();
        }


    }

}
