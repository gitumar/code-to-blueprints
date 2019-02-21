public class DivideConquerStrategy implements BattleShipStrategy {

  @Override
  public void maneuver() {
    System.out.println("Lure ships away from each other and attack each individually");
  }
}
