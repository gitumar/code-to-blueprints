import java.util.List;

public abstract class StarShipCrewMember {


	  public void turnLightsOut() {
		  System.out.println(crewTitle() +
		  " taps,taps lights out." );
	  }

	  public void heaveOutTriceUp() {
		  System.out.println(crewTitle() +
		  " all hands heave out and trice up.");
	  }

	  public void libertyCall() {
		  System.out.println(crewTitle() +
		  " liberty call, liberty call.");
	  }

	  public void crewMuster() {
		  System.out.println(crewTitle() +
		  " time for muster.");
	  }

	  private void task(String task) {
	    switch (task) {
	      case "lights_out":
	        turnLightsOut();
	        break;
	      case "trice_up":
	        heaveOutTriceUp();
	        break;
	      case "liberty_call":
	        libertyCall();
	        break;
	      case "muster":
	        crewMuster();
	        break;
	      case "duty":
	        duty();
	        break;
	      default:
	    	  System.out.println("Undefined task");
	        break;
	    }
	  }

	  public void task(List<String> tasks) {
	    for (String task : tasks) {
	      task(task);
	    }
	  }

	  public abstract void duty();

	  public abstract String crewTitle();
}
