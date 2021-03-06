package Ability.Actives;

import java.util.ArrayList;

import gameplay.Player;

public class ThermoElectricity extends Special
{
	private static boolean targetAll = false;
    private static int manaCost = 0;
    private static int heal = 0;
    private static int percentHeal = 0;
    private static String name = "Thermoelectricity";
    private static String desc = "+20% Frost Resistance for 3 turns | Cost: 30 mana";
    private static String atkDesc = "You become much warmer!";
    private static int dmg;
    private static boolean pureDmg;
    private static boolean doesDmg;
    private static boolean statusEffect = true;
    //{Total Effects,Status Id,dmg,Duration}
    private static int[] statusVal = {1,27,20,3};
    public static boolean limit = false;
    public static boolean use;
    public static boolean useTurn = true;
    
    public ThermoElectricity(boolean t) throws InterruptedException
    {
        super(name,desc,atkDesc,dmg,pureDmg,doesDmg,statusEffect,limit,use,useTurn,statusVal,heal,manaCost,percentHeal,targetAll,20,t);
    }
    
    public static void equip() throws InterruptedException {
    	new ThermoElectricity(true);
    }
    
    @Override
	public ArrayList<Class<? extends Special>> getNewSpecial() {
		ArrayList<Class<? extends Special>> list = new ArrayList<Class<? extends Special>>();
		list.add(OhmicSurge.class);
		list.add(Prism.class);
		return list;
	}

	@Override
	public boolean isLearnable() {
		if(Player.checkAbility(Sparks.class))
			return true;
		return false;
	}
}
