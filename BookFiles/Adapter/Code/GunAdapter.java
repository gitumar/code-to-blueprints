public class GunAdapter implements SlingShot {

	private Gun gun;

	public GunAdapter() {
		gun = new Gun();
	}

	@Override
	public void sling() {
		gun.fire();
	}
}
