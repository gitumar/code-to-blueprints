public final class Inventory {

	private Inventory() {}

	private static final Inventory Instance = new Inventory();

	public static Inventory getInstance() {
		return Instance;
	}
}
