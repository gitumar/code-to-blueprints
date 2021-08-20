#include <iostream>
#include <string>
#include <vector>

using namespace std;

class Publisher;

class Subscriber
{
public:
    virtual ~Subscriber() = default;
    virtual void update(Publisher *publisher) = 0;
};

class Publisher
{
public:
    virtual ~Publisher() = default;
    virtual void subscribe(Subscriber *s);
    virtual void unsubscribe(Subscriber *s);
    virtual void notifySubscribers();

private:
    vector<Subscriber *> subscribers;
};
void Publisher::subscribe(Subscriber *s)
{
    subscribers.push_back(s);
}

void Publisher::unsubscribe(Subscriber *s)
{
    for (int i = 0; i < subscribers.size(); i++)
    {
        if (subscribers[i] == s)
        {
            subscribers.erase(subscribers.begin() + i);
        }
    }
}

void Publisher::notifySubscribers()
{
    for (auto &subscriber : subscribers)
    {
        subscriber->update(this);
    }
}

class Morph
{
public:
    virtual ~Morph() = default;
    virtual void morph() = 0;
};

class ClockTower : public Publisher
{
private:
    string time;

public:
    ~ClockTower() {}
    void timeChanged();

    void setTimeOfDay(string myTime)
    {
        time = myTime;
        timeChanged();
    }

    string getTime()
    {
        return time;
    }
};

void ClockTower::timeChanged()
{
    notifySubscribers();
}

class FreakyAllen : public Subscriber, public Morph
{
private:
    ClockTower *clockTower;

public:
    FreakyAllen(ClockTower *);
    ~FreakyAllen();
    virtual void update(Publisher *);
    virtual void morph();
};
FreakyAllen::FreakyAllen(ClockTower *myClockTower)
{
    clockTower = myClockTower;
    clockTower->subscribe(this);
}

FreakyAllen::~FreakyAllen()
{
    clockTower->unsubscribe(this);
}

void FreakyAllen::update(Publisher *publisher)
{
    morph();
}

void FreakyAllen::morph()
{
    string time = clockTower->getTime();

    if (!time.compare("Morning"))
    {
        cout << "It is " + time + ", so FreakyAllen makes a bowl of cereal" << endl;
    }
    else if (!time.compare("Midday"))
    {
        cout << "It is: " + time + ", so FreakyAllen's right eye starts to twitch" << endl;
    }
    else if (!time.compare("Evening"))
    {
        cout << "It is: " + time + ", so FreakyAllen morphs into a blood sucking wogglesnort" << endl;
    }
}

class FreakyJeff : public Subscriber, public Morph
{
private:
    ClockTower *clockTower;

public:
    FreakyJeff(ClockTower *);
    ~FreakyJeff();
    virtual void update(Publisher *);
    virtual void morph();
};
FreakyJeff::FreakyJeff(ClockTower *myClockTower)
{
    clockTower = myClockTower;
    clockTower->subscribe(this);
}

FreakyJeff::~FreakyJeff()
{
    clockTower->unsubscribe(this);
}

void FreakyJeff::update(Publisher *publisher)
{
    morph();
}

void FreakyJeff::morph()
{
    string time = clockTower->getTime();

    if (!time.compare("Morning"))
    {
        cout << "It is " + time + ", so FreakyJeff makes some grits" << endl;
    }
    else if (!time.compare("Midday"))
    {
        cout << "It is: " + time + ", so FreakyJeff starts growing a tail" << endl;
    }
    else if (!time.compare("Evening"))
    {
        cout << "It is: " + time + ", so FreakyJeff morphs into a clobbering hunberdrine" << endl;
    }
}

class FreakySue : public Subscriber, public Morph
{
private:
    ClockTower *clockTower;

public:
    FreakySue(ClockTower *);
    ~FreakySue();
    virtual void update(Publisher *);
    virtual void morph();
};
FreakySue::FreakySue(ClockTower *myClockTower)
{
    clockTower = myClockTower;
    clockTower->subscribe(this);
}

FreakySue::~FreakySue()
{
    clockTower->unsubscribe(this);
}

void FreakySue::update(Publisher *publisher)
{
    morph();
}

void FreakySue::morph()
{
    string time = clockTower->getTime();

    if (!time.compare("Morning"))
    {
        cout << "It is " + time + ", so FreakySue makes some oatmeal" << endl;
    }
    else if (!time.compare("Midday"))
    {
        cout << "It is: " + time + ", so FreakySue's nails start lengthening" << endl;
    }
    else if (!time.compare("Evening"))
    {
        cout << "It is: " + time + ", so FreakySue morphs into a pernicious punderbarg" << endl;
    }
}

int main()
{

    ClockTower *clockTower = new ClockTower();
    FreakyAllen *freakyAllen = new FreakyAllen(clockTower);
    FreakyJeff *freakyJeff = new FreakyJeff(clockTower);
    FreakySue *freakySue = new FreakySue(clockTower);

    clockTower->setTimeOfDay("Morning");
    clockTower->setTimeOfDay("Midday");
    clockTower->setTimeOfDay("Evening");

    delete clockTower;
    delete freakyAllen;
    delete freakyJeff;
    delete freakySue;

    return 0;
}