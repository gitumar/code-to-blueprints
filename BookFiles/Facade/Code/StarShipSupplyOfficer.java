
public class StarShipSupplyOfficer extends StarShipCrewMember {

	@Override
	public void duty() {
		System.out.println(crewTitle() + 
		" ensures there are ample ship supplies.");
	}

	@Override
	public String crewTitle() {
		return "The Supply Officer";
	}

}
