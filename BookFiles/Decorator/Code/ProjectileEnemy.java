public class ProjectileEnemy implements Enemy {

	private Enemy decoratedEnemy;

	public ProjectileEnemy(Enemy decoratedEnemy) {
		this.decoratedEnemy = decoratedEnemy;
	}

	@Override
	public void fight() {
		decoratedEnemy.fight();
		System.out.println("The enemy blows a kiss and fires a gun");
	}

	@Override
	public int getDamage() {
		return decoratedEnemy.getDamage() + 95;
	}

	@Override
	public void die() {
		decoratedEnemy.die();
	}
}
