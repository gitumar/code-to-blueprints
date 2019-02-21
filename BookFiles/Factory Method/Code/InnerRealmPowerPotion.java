public class InnerRealmPowerPotion extends Potion {
	
	public InnerRealmPowerPotion() {
		potionName = "Inner Realm Power Potion";
		gooeyness = "Mucus Like";
		blood = "Orc Blood";
 
		herbs.add("Root of Inner Realm");
		herbs.add("Sage of Inner Realm");
	}
 
	void brew() {
		System.out.println("Brewing at High Temperature");
	}
}
