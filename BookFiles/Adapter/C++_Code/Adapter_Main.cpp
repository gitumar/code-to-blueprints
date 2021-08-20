#include <iostream>

using namespace std;

class SlingShot
{

public:
    virtual void sling() = 0;
    virtual ~SlingShot() = default;
};

class Gun
{

public:
    void fire()
    {
        cout << "Our gun is firing";
    }
};

class GunAdapter : public SlingShot
{

private:
    Gun *weapon;

public:
    GunAdapter() : weapon(new Gun()){}
    ~GunAdapter() {delete weapon;}
    void sling() override
    {
        weapon->fire();
    }
};

class Shooter : public SlingShot
{

private:
    SlingShot *slingShot;

public:
    explicit Shooter(SlingShot *mySlingShot) : slingShot(mySlingShot) {}

    void sling()
    {
        slingShot->sling();
    }
};

int main()
{
    Shooter shooter = Shooter(new GunAdapter());
    shooter.sling();
    return 0;
}