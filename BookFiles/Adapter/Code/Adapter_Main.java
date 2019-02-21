public class Adapter_Main {

	public static void main(String[] args) {
		
		Shooter shooter = new Shooter(new GunAdapter());
		shooter.sling();
	}
}
