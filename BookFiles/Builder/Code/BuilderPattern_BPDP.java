interface FloorPlan 
{ 
	public void setSwimmingPool(String swimmingPool); 

	public void setLobbyArea(String lobbyArea); 

	public void setRooms(String rooms); 

	public void setRestaurants(String restaurants); 
} 

class Lodging implements FloorPlan 
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

} 


interface LodgingBuilder 
{ 

	public void buildSwimmingPool(); 

	public void buildLobbyArea(); 

	public void buildRooms(); 

	public void buildRestaurants(); 

	public Lodging getLodging(); 
} 

class HotelLodgingBuilder implements LodgingBuilder 
{ 
	private Lodging lodging; 

	public HotelLodgingBuilder() 
	{ 
		this.lodging = new Lodging(); 
	} 

	public void buildSwimmingPool() 
	{ 
		lodging.setSwimmingPool("Indoor Lagoon"); 
	} 

	public void buildLobbyArea() 
	{ 
		lodging.setLobbyArea("Grand Hall"); 
	} 

	public void buildRestaurants() 
	{ 
		lodging.setRestaurants("5 star Buffet"); 
	} 

	public void buildRooms() 
	{ 
		lodging.setRooms("Luxury Suites"); 
	} 

	public Lodging getLodging() 
	{ 
		return this.lodging; 
	} 
} 

class MotelLodgingBuilder implements LodgingBuilder 
{ 
	private Lodging lodging; 

	public MotelLodgingBuilder() 
	{ 
		this.lodging = new Lodging(); 
	} 

	public void buildSwimmingPool() 
	{ 
		lodging.setSwimmingPool("Green Slim"); 
	} 

	public void buildLobbyArea() 
	{ 
		lodging.setLobbyArea("Economical"); 
	} 

	public void buildRestaurants() 
	{ 
		lodging.setRestaurants("Vending Machines"); 
	} 

	public void buildRooms() 
	{ 
		lodging.setRooms("Bates Style"); 
	} 

	public Lodging getLodging() 
	{ 
		return this.lodging; 
	} 

} 

class ArchitecturalEngineer 
{ 

	private LodgingBuilder lodgingBuilder; 

	public ArchitecturalEngineer(LodgingBuilder lodgingBuilder) 
	{ 
		this.lodgingBuilder = lodgingBuilder; 
	} 

	public Lodging getLodging() 
	{ 
		return this.lodgingBuilder.getLodging(); 
	} 
//this should accept the lodgingbuilder not the constructor because we want to reuse the civil engineer
// but does that make this an entirely different desing pattern then?
	public void constructLodging() 
	{ 
		this.lodgingBuilder.buildSwimmingPool(); 
		this.lodgingBuilder.buildLobbyArea(); 
		this.lodgingBuilder.buildRooms(); 
		this.lodgingBuilder.buildRestaurants(); 
	} 
} 

class Builder 
{ 
	public static void main(String[] args) 
	{ 
		LodgingBuilder hotelBuilder = new HotelLodgingBuilder(); 
		ArchitecturalEngineer engineer = new ArchitecturalEngineer(hotelBuilder); 

		engineer.constructLodging(); 

		Lodging lodging = engineer.getLodging(); 

	} 
} 
