package Ability.Actives;

import java.util.ArrayList;

import gameplay.Player;

public class Frankenstein extends Special
{
	private static boolean targetAll = false;
    private static int manaCost = 0;
    private static int heal = 0;
    private static int percentHeal = 0;
    private static String name = "Frankenstein's Delight";
    private static String desc = "+5 dmg 3 turns. Deals 144 shock dmg. Stuns for 3 turns. | Cost: 72 health";
    private static String atkDesc = "You summon a monster fueled by storms and blood to destory the enemy.";
    private static int dmg;
    private static boolean pureDmg;
    private static boolean doesDmg;
    private static boolean statusEffect = true;
    //{Total Effects,Status Id,dmg,Duration}
    private static int[] statusVal = {4,13,144,1,3,0,3,6,5,3,9,69,0};
    public static boolean limit = false;
    public static boolean use;
    public static boolean useTurn = true;
    
    public Frankenstein(boolean t) throws InterruptedException
    {
        super(name,desc,atkDesc,dmg,pureDmg,doesDmg,statusEffect,limit,use,useTurn,statusVal,heal,manaCost,percentHeal,targetAll,0,t);
    }
    
    public static void equip() throws InterruptedException {
    	new Frankenstein(true);
    }
    
   
    
      

		@Override
		public ArrayList<Class<? extends Special>> getNewSpecial() {
			ArrayList<Class<? extends Special>> list = new ArrayList<Class<? extends Special>>();

			return list;
		}

		@Override
		public boolean isLearnable() {

			return false;
		}
}
