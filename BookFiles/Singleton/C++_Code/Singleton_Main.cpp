#include <iostream>
using namespace std;

class Inventory
{
    static Inventory *instance;

    Inventory() {}

public:
    static Inventory *getInstance()
    {
        if (!instance)
            instance = new Inventory;
        return instance;
    }


};


Inventory *Inventory::instance = 0;

int main()
{
    Inventory *s = s->getInstance();
 
    cout << s ;
    return 0;
}