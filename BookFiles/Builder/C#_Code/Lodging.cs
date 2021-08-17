using System;
class Lodging : FloorPlan 
{ 

	private String swimmingPool; 
	private String lobbyArea; 
	private String rooms; 
	private String restaurants; 

	public void setSwimmingPool(String swimmingPool) 
	{ 
		this.swimmingPool = swimmingPool; 
	} 

	public void setLobbyArea(String lobbyArea) 
	{ 
		this.lobbyArea = lobbyArea; 
	} 

	public void setRooms(String rooms) 
	{ 
		this.rooms = rooms; 
	} 

	public void setRestaurants(String restaurants) 
	{ 
		this.restaurants = restaurants; 
	} 

    public void lodgingCharacteristics(){
        Console.WriteLine(swimmingPool);
        Console.WriteLine(lobbyArea);
        Console.WriteLine(rooms);
        Console.WriteLine(restaurants);
    }
} 