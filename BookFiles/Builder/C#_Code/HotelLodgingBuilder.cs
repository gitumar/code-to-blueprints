class HotelLodgingBuilder : LodgingBuilder 
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