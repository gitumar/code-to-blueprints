public class FactoryMethod_Main {
 
	public static void main(String[] args) {
		PotionShop outerRealmShop = new OuterRealmPotionShop();
		PotionShop innerRealmShop = new InnerRealmPotionShop();
 
		Potion potion = outerRealmShop.orderPotion("Health");
		System.out.println("Potion is " + potion.getPotionName() + "\n");
 
		potion = innerRealmShop.orderPotion("Health");
		System.out.println("Potion is " + potion.getPotionName() + "\n");

		potion = outerRealmShop.orderPotion("Power");
		System.out.println("Potion is " + potion.getPotionName() + "\n");
 
		potion = innerRealmShop.orderPotion("Power");
		System.out.println("Potion is " + potion.getPotionName() + "\n");

		potion = outerRealmShop.orderPotion("Skill");
		System.out.println("Potion is " + potion.getPotionName() + "\n");
 
		potion = innerRealmShop.orderPotion("Skill");
		System.out.println("Potion is " + potion.getPotionName() + "\n");
	}
}
