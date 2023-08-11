public class ToolStore extends NormalLoc{
    ToolStore(Player player) {
        super(player, "Mağaza");
    }

    @Override
    public boolean getLocation() {
        System.out.println("Para: "+player.getMoney());
        System.out.println("1.Silah..");
        System.out.println("2.Zırh..");
        System.out.println("3. Çıkış..");
        System.out.println("Seçiminiz: ");
        int selTool=scanner.nextInt();
        int selItemId;
        switch(selTool){
            case 1:
                selItemId=weaponMenu();
                buyWeapon(selItemId);
                break;
            case 2:
                selItemId=armorMenu();
                buyArmor(selItemId);
        }
        return true;
    }
    public void buyArmor(int armorId){
        int armor=0,money=0;
        String aName=null;
        switch(armorId){
            case 1:
                armor=1;
                money=15;
                aName="Hafif zırh";
                break;
            case 2:
                armor=3;
                money=25;
                aName="Orta zırh";
                break;
            case 3:
                armor=5;
                money=45;
                aName="Ağır zırh";
                break;
            case 4:
                System.out.println("Çıkış yapılıyor...");
                break;
            default:
                System.out.println("Gecersiz işlem..");
                break;

        }
        if(money>0){
            if(player.getMoney()>0){
                player.getInv().setArmor(armor);
                player.getInv().setaName(aName);
                player.setMoney(player.getMoney()-money);
                System.out.println(aName+" satın aldınız , engellenen hasar: "+player.getInv().getArmor()+"Kalan para: "+player.getMoney());
            }
            else{
                System.out.println("Para yetersiz...");
            }
        }

    }
    public int armorMenu(){
        System.out.println("1.Hafif <Para: 15 - Engelleme: 1");
        System.out.println("2.Orta: <Para: 25 - Engelleme: 3");
        System.out.println("3.Ağır: <Para: 45 - Engelleme: 5");
        int armorId=scanner.nextInt();
        return armorId;
    }
    public int weaponMenu(){
        System.out.println("1. Tabanca < Para: 25 - Hasar: 2 > ");
        System.out.println("2. Kılıç < Para: 35  - Hasar: 3 > ");
        System.out.println("3. Tüfek < Para: 45 - Hasar: 7 > ");
        System.out.println("4.Çıkış");
        System.out.println("Silah Seçiniz: ");
        int selWeaponID=scanner.nextInt();
        return selWeaponID;
    }
    public void buyWeapon(int itemId){
        int damage=0,price=0;
        String wName=null;

            switch ((itemId)){
                case 1:
                    damage=2;
                    wName="Tabanca";
                    price=25;
                    break;
                case 2:
                    damage=3;
                    wName="Kılıç";
                    price=35;
                    break;
                case 3:
                    damage=7;
                    wName="Tüfek";
                    price=45;
                    break;
                case 4:
                    System.out.println("Çıkış yapılıyor...");
                    break;
                default:
                    System.out.println("Gecersiz işlem..");
                    break;

            }
            if(player.getMoney()>price && price>0) {

                player.getInv().setDamage(damage);
                player.getInv().setwName(wName);
                player.setMoney(player.getMoney()-price);
                System.out.println(wName+" alımı yapıldı.Eski hasar:"+player.getDamage()+"/// Yeni hasar: "+player.TotalDamage());
            }
            else{
                System.out.println("Yetersiz bakiye...");
            }




    }
}
