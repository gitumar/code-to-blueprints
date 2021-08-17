using System;

namespace Singleton
{
    class Singleton_Main
    {
        static void Main(string[] args)
        {
            Inventory myInventory = Inventory.getInstance();
	        Console.WriteLine(myInventory);
        }
    }
}
