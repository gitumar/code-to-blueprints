public class Shooter : SlingShot {

  private SlingShot slingShot;

  public Shooter(SlingShot slingShot) {
    this.slingShot = slingShot;
  }

  public void sling() {
    slingShot.sling();
  }

}
