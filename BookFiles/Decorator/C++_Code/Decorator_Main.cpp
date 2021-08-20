#include <iostream>
using namespace std;


class Enemy
{
public:
    virtual ~Enemy() {}

    virtual void fight() = 0;
    virtual int getDamage() = 0;
    virtual void die() = 0;
};

class ConcreteEnemy : public Enemy
{
public:
    ~ConcreteEnemy() {}

    void fight()
    {
        
    }
    int getDamage()
    {
        return 0;
    }
    void die()
    {
        
    }
};

class Decorator : public Enemy
{
private:
    Enemy *enemy;

public:
    ~Decorator() {}

    Decorator(Enemy *myEnemy) : enemy(myEnemy) {}

    virtual void fight()
    {
        enemy->fight();
    }
    virtual int getDamage()
    {
        return enemy->getDamage();
    }
    virtual void die()
    {
        enemy->die();
    }
};

class MeleeEnemy : public Decorator
{
public:
    MeleeEnemy(Enemy *c) : Decorator(c) {}

    void fight()
    {
        Decorator::fight();
        cout << "The enemy throws heavy punches" << endl;
    }
    int getDamage()
    {
        return Decorator::getDamage() + 5;
    }
    void die()
    {
        Decorator::die();
        cout << "The enemy writhes in agony and disintegrates" << endl;
    }
};

class ProjectileEnemy : public Decorator
{
public:
    ProjectileEnemy(Enemy *c) : Decorator(c) {}

    void fight()
    {
        Decorator::fight();
        cout << "The enemy blows a kiss and fires a gun" << endl;
    }
    int getDamage()
    {

        return Decorator::getDamage() + 95;
    }
    void die()
    {
        Decorator::die();
        cout << "The enemy writhes in agony and disintegrates even more" << endl;
    }
};

int main()
{

    ConcreteEnemy *concreteEnemy = new ConcreteEnemy();
    MeleeEnemy *meleeEnemy = new MeleeEnemy(concreteEnemy);
    ProjectileEnemy *projectileEnemy = new ProjectileEnemy(meleeEnemy);

    cout << "Melee Enemies are on the horizon" << endl;
    Enemy *enemy = meleeEnemy;
    enemy->fight();
    cout << "Melee Enemies cause " << enemy->getDamage() << " damage." << endl;
    enemy->die();

    cout << "Enemies are now armed with guns" << endl;
    enemy = projectileEnemy;
    enemy->fight();
    cout << "Projectile Enemies cause " << enemy->getDamage() << " damage." << endl;
    enemy->die();

    delete projectileEnemy;
    delete meleeEnemy;
    delete concreteEnemy;

    return 0;
}