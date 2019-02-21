public class Strategy_Main {

  public static void main(String[] args) {
    
    System.out.println("A tiny frigate wants some trouble");
    BattleShip battleShip = new BattleShip(new BruteForceStrategy());
    battleShip.engage();
    System.out.println("Four tiny frigates want some trouble");
    battleShip.alterManeuvers(new DivideConquerStrategy());
    battleShip.engage();
    System.out.println("An aircraft carrier group wants some trouble");
    battleShip.alterManeuvers(new RetreatStrategy());
    battleShip.engage();
  }
}
