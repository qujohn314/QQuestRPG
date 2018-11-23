package Item;
public class HighPotion
{
    public static boolean marine = false;
   public static boolean heal = true;
   public static boolean strength = false;
   public static boolean elixer = false;
   public static int healUp = 50;
   public static int strengthUp = 0;
   public static String name = "Hi-Potion";
   public static String desc = "Heals 50% of health";
   public static void newItem() throws InterruptedException
   {
       ItemManager.newItem(heal,strength,elixer,healUp,strengthUp,name,desc,marine);
       ItemManager.setItem();
   }
        public static void lootItem() throws InterruptedException
   {
       Main.LootScreen.setLootItem((name + " | " + desc));
       ItemManager.newItem(heal,strength,elixer,healUp,strengthUp,name,desc,marine);
       ItemManager.setItem();
    }
}