using System;
public class ProjectileEnemy : Enemy {

  private Enemy decoratedEnemy;

  public ProjectileEnemy(Enemy decoratedEnemy) {
    this.decoratedEnemy = decoratedEnemy;
  }

  public void fight() {
    decoratedEnemy.fight();
	 Console.WriteLine("The enemy blows a kiss and fires a gun");
  }

  public int getDamage() {
    return decoratedEnemy.getDamage() + 95;
  }

  public void die() {
    decoratedEnemy.die();
  }
}
