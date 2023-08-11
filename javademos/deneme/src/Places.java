import java.util.Scanner;

public class Places {
    Canavarlar monster=new Canavarlar();
    String name;
    static String award;
    void setPlace(int id){
        if(id==1){
            monster.setSelect(id);
            setAward("Food");
            setName("Magara");
        }
        if(id==2){
            monster.setSelect(id);
            setAward("Wood");
            setName("Jungle");
        }
        if(id==3){
            monster.setSelect(id);
            setAward("Water");
            setName("River");
        }

    }
    void setName(String _name){
        name=_name;
    }
    void setAward(String award){
        this.award=award;
    }
    String getName(){
        return name;

    }
    static String getAward(){
        return award;
    }
    void print(){
        System.out.println("Mekan: "+getName());
        System.out.println("Canavar: "+monster.getName());
        System.out.println("Ganimet: "+getAward());
    }
}
