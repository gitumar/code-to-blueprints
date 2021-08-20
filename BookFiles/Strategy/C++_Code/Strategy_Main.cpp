#include <iostream>

using namespace std;

class BattleShipStrategy
{
public:
    virtual ~BattleShipStrategy() = default;
    virtual void maneuver() = 0;
};

class BruteForceStrategy : public BattleShipStrategy
{
public:
    ~BruteForceStrategy() {}

    void maneuver()
    {
        cout << "We can take these ships head on" << std::endl;
    }
};

class DivideConquerStrategy : public BattleShipStrategy
{
public:
    ~DivideConquerStrategy() {}

    void maneuver()
    {
        cout << "Lure ships away from each other and attack each individually" << std::endl;
    }
};

class RetreatStrategy : public BattleShipStrategy
{
public:
    ~RetreatStrategy() {}

    void maneuver()
    {
        cout << "Full speed away!" << std::endl;
    }
};

class BattleShip
{

private:
    BattleShipStrategy *battleStrategy;

public:
    BattleShip(BattleShipStrategy *s) : battleStrategy(s) {}

    ~BattleShip()
    {
        delete battleStrategy;
    }
    void alterManeuvers(BattleShipStrategy *myBattleStrategy)
    {
        battleStrategy = myBattleStrategy;
    }

    void engage()
    {
        battleStrategy->maneuver();
    }
};

int main()
{
    cout << "A tiny frigate wants some trouble" << endl;
    BattleShip *battleShip = new BattleShip(new BruteForceStrategy());
    battleShip->engage();
    cout << "Four tiny frigates want some trouble" << endl;
    battleShip->alterManeuvers(new DivideConquerStrategy());
    battleShip->engage();
    cout << "An aircraft carrier group wants some trouble" << endl;
    battleShip->alterManeuvers(new RetreatStrategy());
    battleShip->engage();
    return 0;
}