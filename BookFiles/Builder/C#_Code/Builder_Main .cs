using System;

namespace Builder
{
    class Builder_Main 
    {
        static void Main(string[] args)
        {
            LodgingBuilder hotelBuilder = new HotelLodgingBuilder(); 
            ArchitecturalEngineer engineer = new ArchitecturalEngineer(hotelBuilder); 

            engineer.constructLodging(); 

            Lodging lodging = engineer.getLodging(); 
            
            lodging.lodgingCharacteristics();
        }
    }
}
