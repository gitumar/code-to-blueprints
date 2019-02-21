public abstract class PotionShop {
 
	abstract Potion concoctPotion(String potionSKU);
 
	public Potion orderPotion(String category) {
		Potion potion = concoctPotion(category);
		System.out.println("Concocting " + potion.getPotionName());
		potion.boil();
		potion.bubble();
		potion.brew();
		potion.bottle();
		return potion;
	}
}
