public class Observer_Main {

	public static void main(String[] args) {
		ClockTower clockTower = new ClockTower();
	
		FreakyAllen freakyAllen = new FreakyAllen(clockTower);
		FreakySue freakySue = new FreakySue(clockTower);
		FreakyJeff freakyJeff = new FreakyJeff(clockTower);

		clockTower.setTimeOfDay("Morning");
		clockTower.setTimeOfDay("Midday");
		clockTower.setTimeOfDay("Evening");
	}
}
