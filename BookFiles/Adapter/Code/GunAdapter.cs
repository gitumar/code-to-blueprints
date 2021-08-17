public class GunAdapter: SlingShot {

  private Gun weapon;

  public GunAdapter() {
    weapon = new Gun();
  }

 
  public void sling() {
    weapon.fire();
  }
}
