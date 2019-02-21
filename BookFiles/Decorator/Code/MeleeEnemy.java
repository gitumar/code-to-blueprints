public class MeleeEnemy implements Enemy {

	@Override
	public void fight() {
		System.out.println("The enemy throws heavy punches");
	}

	@Override
	public int getDamage() {
		return 5;
	}

	@Override
	public void die() {
		System.out.println("The enemy writhes in agony and disintegrates");
	}
}
