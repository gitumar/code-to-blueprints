using System;
public class MeleeEnemy : Enemy {


  public void fight() {
    Console.WriteLine("The enemy throws heavy punches");
  }

  public int getDamage() {
    return 5;
  }

  public void die() {
	Console.WriteLine("The enemy writhes in agony and disintegrates");
  }
}
