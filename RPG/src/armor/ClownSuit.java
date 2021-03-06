package armor;
import backend.*;
public class ClownSuit
{
	public static int fireR;
	public static int iceR;
	public static int shockR;
    public static int def = 30;
    public static int price = 830;
    public static String name = "Clown Suit";
    public static String desc = "You look like a fool, but its light and Durable.";
    public static void setArmor() throws InterruptedException
    {
        RPGRunner.append("You've equipped " + name + ".");
        ArmorManager.setArmor(def,name,desc,price,fireR,iceR,shockR);
    }
    public static void lootArmor() throws InterruptedException
    {
    	gameplay.LootScreen.setLootArmor(new ArmorManager(def,name,desc,price,fireR,iceR,shockR));
    }
    
    public static ArmorManager newArmor() {
    	return new ArmorManager(def,name,desc,price,fireR,iceR,shockR);
    }
}


