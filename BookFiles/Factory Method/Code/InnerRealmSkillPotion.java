public class InnerRealmSkillPotion extends Potion {
	
	public InnerRealmSkillPotion() {
		potionName = "Inner Realm Skill Potion";
		gooeyness = "Mucus Like";
		blood = "Orc Blood";
 
		herbs.add("Root of Inner Realm");
		herbs.add("Red Clover of Inner Realm");
		herbs.add("Wildrose of Inner Realm");
		herbs.add("Yarrow of Inner Realm");

	}
 
	void brew() {
		System.out.println("Brewing at High Temperature");
	}
}
