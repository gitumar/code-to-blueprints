public class Inventory {

  private static readonly Inventory Instance = new Inventory();

  private Inventory() {}


  public static Inventory getInstance() {
    return Instance;
  }
}
