public class SafeHouse extends NormalLoc{
    SafeHouse(Player player) {
        super(player, "Guvenli ev");
    }

    @Override
    public boolean getLocation() {
         player.setHealth(player.getRhealth());
         System.out.println("Canınız fullendi guvenli evdesiniz..");
         return true;
    }
}
