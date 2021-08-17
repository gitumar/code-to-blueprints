using System;

namespace Decorator
{
    class Decorator_Main
    {
        static void Main(string[] args)
        {
          
            Console.WriteLine("Melee Enemies are on the horizon");
            Enemy enemy = new MeleeEnemy();
            enemy.fight();
            enemy.die();
            Console.WriteLine("Melee Enemies cause "+ enemy.getDamage() +" damage.");

        
            Console.WriteLine("Enemies are now armed with guns");
            Enemy projectileEnemy = new ProjectileEnemy(enemy);
            projectileEnemy.fight();
            projectileEnemy.die();
            Console.WriteLine("Projectile Enemies cause "+ projectileEnemy.getDamage()+" damage.");
        }
    }
}
