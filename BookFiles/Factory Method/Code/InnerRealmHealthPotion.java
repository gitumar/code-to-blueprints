public class InnerRealmHealthPotion extends Potion {

	public InnerRealmHealthPotion() { 
		potionName = "Inner Realm Health Potion";
		gooeyness = "Mucus Like";
		blood = "Orc Blood";
 
		herbs.add("Root of Inner Realm");
	}
 
	void brew() {
		System.out.println("Brewing at High Temperature");
	}
}
