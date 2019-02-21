public class Decorator_Main {

	public static void main(String[] args) {

			
		System.out.println("Melee Enemies are on the horizon");
		Enemy enemy = new MeleeEnemy();
		enemy.fight();
		enemy.die();
		System.out.println("Melee Enemies cause "+ enemy.getDamage() +"damage.");

		   
		System.out.println("Enemies are now armed with guns");
		Enemy projectileEnemy = new ProjectileEnemy(enemy);
		projectileEnemy.fight();
		projectileEnemy.die();
		System.out.println("Projectile Enemies cause "+ projectileEnemy.getDamage()+" damage.");
	}
}
