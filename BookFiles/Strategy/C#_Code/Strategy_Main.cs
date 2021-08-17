using System;

namespace Strategy
{
    class Strategy_Main
    {
        static void Main(string[] args)
        {
            Console.WriteLine("A tiny frigate wants some trouble");
            BattleShip battleShip = new BattleShip(new BruteForceStrategy());
            battleShip.engage();
            Console.WriteLine("Four tiny frigates want some trouble");
            battleShip.alterManeuvers(new DivideConquerStrategy());
            battleShip.engage();
            Console.WriteLine("An aircraft carrier group wants some trouble");
            battleShip.alterManeuvers(new RetreatStrategy());
            battleShip.engage();
        }
    }
}
