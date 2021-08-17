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