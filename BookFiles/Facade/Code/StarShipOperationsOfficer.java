
public class StarShipOperationsOfficer extends StarShipCrewMember {

	@Override
	public void duty() {
		System.out.println(crewTitle() +
		" synthesizes and disseminates incoming information.");
	}

	@Override
	public String crewTitle() {
		return "The Ops Officer";
	}

}
