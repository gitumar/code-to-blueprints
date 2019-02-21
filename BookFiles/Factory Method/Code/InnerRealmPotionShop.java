public class InnerRealmPotionShop extends PotionShop {

	Potion concoctPotion(String potionSKU) {
		if (potionSKU.equals("Health")) {
			return new InnerRealmHealthPotion();
		} else if (potionSKU.equals("Power")) {
			return new InnerRealmPowerPotion();
		} else if (potionSKU.equals("Skill")) {
			return new InnerRealmSkillPotion();
		} else return null;
	}
}
