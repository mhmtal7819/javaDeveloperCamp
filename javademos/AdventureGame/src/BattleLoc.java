public abstract class BattleLoc extends Location {
    Obstacle obstacle;
    protected String award;
    BattleLoc(Player player,String name,Obstacle obstacle,String award) {
        super(player);
        this.name=name;
        this.obstacle=obstacle;
        this.award=award;
    }

    @Override
    public boolean getLocation() {
        int obsCount=obstacle.obstacleCount();
        System.out.println("Geldiginiz yer: "+this.getName());
        System.out.println("Dikkat burada "+obsCount+" adet "+obstacle.getName() +" var");
        System.out.println("<S>avas veya <K>aç: ");
        String runorfight=scanner.nextLine();
        runorfight=runorfight.toUpperCase();
        if(runorfight.equals("S")){
            if( combat(obsCount)){
                System.out.println("Tüm düşmanları temizlediniz...");
                if(this.award=="Yemek" && player.getInv().isFood()==false ){
                    System.out.println(this.award+" kazandınız");
                    player.getInv().setFood(true);
                } else if (this.award=="Su" && player.getInv().isWater()==false) {
                    System.out.println(this.award+" kazandınız");
                    player.getInv().setWater(true);
                }
                else if(this.award=="Odun" && player.getInv().isFirewood()==false){
                    System.out.println(this.award+" kazandınız");
                    player.getInv().setFirewood(true);
                }
                return true;
            }
            else{
                System.out.println("Öldünüz..");
                return false;
            }

        }
        return true;
    }
    public boolean combat(int obsCount){
        for(int i=0;i<obsCount;i++){
            int defObsHealth=obstacle.getHealth();
            playerStats();
            enemiesStats();
            while(player.getHealth()>0 && obstacle.getHealth()>0){
                System.out.println("<V>ur veya <K>aç: ");
                String selectAttack=scanner.nextLine();
                selectAttack=selectAttack.toUpperCase();
                if(selectAttack.equals("V")){
                    System.out.println(obstacle.getName()+" vurdunuz!!! ");
                    obstacle.setHealth(obstacle.getHealth()-player.TotalDamage());
                    System.out.println("Oyuncu canı: "+player.getHealth());
                    System.out.println("Canavarın canı: "+obstacle.getHealth());
                    afterHit();
                    if(obstacle.getHealth()>0){
                        System.out.println();
                        System.out.println(obstacle.getName()+" size saldırdı");
                        player.setHealth(player.getHealth()-(obstacle.getDamage()-player.getInv().getArmor()));
                       //System.out.println(player.getName()+" karakterinizin canı: "+player.getHealth());
                        afterHit();
                    }


                }else{
                    break;
                }
            }
            if(obstacle.getHealth()< player.getHealth()){
                System.out.println("Tum dusmanları yendınız: ");
                player.setMoney((player.getMoney()+obstacle.getAward()));
                System.out.println("Guncel paranız: "+player.getMoney());
                obstacle.setHealth(defObsHealth);
            }else{
                return false;
            }
        }
        return true;


    }
    public void afterHit(){

    }
    public void playerStats(){
        System.out.println("Oyuncu değerleri:...");
        System.out.println("Can: "+player.getHealth());
        System.out.println("Hasar: "+player.TotalDamage());
        System.out.println("Parası: "+player.getMoney());
        if(player.getInv().getDamage()>0){
            System.out.println("Silah: "+player.getInv().getwName());

        }
        if(player.getInv().getArmor()>0){
            System.out.println("Armor: "+player.getInv().getaName());
        }
    }

    public void enemiesStats(){
        System.out.println("Düşman: "+obstacle.getName());
        System.out.println("Can: "+obstacle.getHealth());
        System.out.println("Hasar: "+obstacle.getDamage());
        System.out.println("Ödül: "+obstacle.getAward());
    }
}
