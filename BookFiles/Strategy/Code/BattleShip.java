public class BattleShip {

  private BattleShipStrategy battleStrategy;

  public BattleShip(BattleShipStrategy battleStrategy) {
    this.battleStrategy = battleStrategy;
  }

  public void alterManeuvers(BattleShipStrategy battleStrategy) {
    this.battleStrategy = battleStrategy;
  }

  public void engage() {
    battleStrategy.maneuver();
  }
}
