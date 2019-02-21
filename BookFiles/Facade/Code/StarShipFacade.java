import java.util.ArrayList;
import java.util.List;

public class StarShipFacade {
	  private final List<StarShipCrewMember> crew;
	  
	  private List<String> tasks;

	  public StarShipFacade() {
	    crew = new ArrayList<>();
	    tasks= new ArrayList<>();
	    crew.add(new StarShipNavigationOfficer());
	    crew.add(new StarShipSupplyOfficer());
	    crew.add(new StarShipOperationsOfficer());
	  }

	  public void reveille() {
	    tasks.clear();
	    tasks.add("trice_up");
	    tasks.add("muster");
	    performTasks(crew, tasks);
	    
	  }

	  public void planOfTheDay() {
		tasks.clear();
		tasks.add("duty");
		performTasks(crew, tasks);
	  }

	  public void taps() {
		tasks.clear();
		tasks.add("liberty_call");
		tasks.add("lights_out");
		performTasks(crew, tasks);
	  }

	  private static void performTasks(List<StarShipCrewMember> crew,
		List<String> tasks) {
		for (StarShipCrewMember crewMember : crew) {
			crewMember.task(tasks);
		}
	  }
}
