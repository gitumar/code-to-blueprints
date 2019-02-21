public class OuterRealmPotionShop extends PotionShop {

	Potion concoctPotion(String potionSKU) {
		if (potionSKU.equals("Health")) {
			return new OuterRealmHealthPotion();
		} else if (potionSKU.equals("Power")) {
			return new OuterRealmPowerPotion();
		} else if (potionSKU.equals("Skill")) {
			return new OuterRealmSkillPotion();
		} else return null;
	}
}
