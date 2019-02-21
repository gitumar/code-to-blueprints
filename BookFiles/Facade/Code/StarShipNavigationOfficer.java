
public class StarShipNavigationOfficer extends StarShipCrewMember {

	@Override
	public void duty() {
		System.out.println(crewTitle() + " navigates the ship.");
	}

	@Override
	public String crewTitle() {
		return "The Nav Officer";
	}

}
