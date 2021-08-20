#include <iostream>
#include <string>
using namespace std;

class FloorPlan
{
public:
    virtual ~FloorPlan() = default;

    virtual void setSwimmingPool(string swimmingPool) = 0;
    virtual void setLobbyArea(string lobbyArea) = 0;
    virtual void setRooms(string rooms) = 0;
    virtual void setRestaurants(string restaurants) = 0;
};


class Lodging : FloorPlan
{

private:
    string swimmingPool;
    string lobbyArea;
    string rooms;
    string restaurants;

public:
    void setSwimmingPool(string mySwimmingPool)
    {
        swimmingPool = mySwimmingPool;
    }
    void setLobbyArea(string myLobbyArea)
    {
        lobbyArea = myLobbyArea;
    }

    void setRooms(string myRooms)
    {
        rooms = myRooms;
    }

    void setRestaurants(string myRestaurants)
    {
        restaurants = myRestaurants;
    }

    void lodgingCharacteristics()
    {
        cout << swimmingPool << endl;
        cout << lobbyArea << endl;
        cout << rooms << endl;
        cout << restaurants << endl;
    }
};

class LodgingBuilder
{
public:
    virtual ~LodgingBuilder() = default;

    virtual void buildSwimmingPool() = 0;
    virtual void buildLobbyArea() = 0;
    virtual void buildRooms() = 0;
    virtual void buildRestaurants() = 0;
    virtual Lodging getLodging() = 0;
};


class HotelLodgingBuilder : public LodgingBuilder
{
private:
    Lodging *lodging;

public:
    HotelLodgingBuilder() : lodging(new Lodging()) {}
    ~HotelLodgingBuilder() { delete lodging; }

    void buildSwimmingPool()
    {
        lodging->setSwimmingPool("Indoor Lagoon");
    }

    void buildLobbyArea()
    {
        lodging->setLobbyArea("Grand Hall");
    }
    void buildRestaurants()
    {
        lodging->setRestaurants("5 star Buffet");
    }

    void buildRooms()
    {
        lodging->setRooms("Luxury Suites");
    }

    Lodging getLodging()
    {
        return *lodging;
    }
};

class ArchitecturalEngineer
{

private:
    LodgingBuilder *lodgingBuilder;

public:
    explicit ArchitecturalEngineer(LodgingBuilder *myLodgingBuilder) : lodgingBuilder(myLodgingBuilder) {}

    Lodging getLodging()
    {
        return lodgingBuilder->getLodging();
    }

    void constructLodging()
    {
        lodgingBuilder->buildSwimmingPool();
        lodgingBuilder->buildLobbyArea();
        lodgingBuilder->buildRooms();
        lodgingBuilder->buildRestaurants();
    }
};

int main()
{

    LodgingBuilder* hotelBuilder = new HotelLodgingBuilder();
    ArchitecturalEngineer* engineer = new ArchitecturalEngineer(hotelBuilder);

    engineer->constructLodging();

    Lodging lodging = engineer->getLodging();

    lodging.lodgingCharacteristics();

    return 0;
}