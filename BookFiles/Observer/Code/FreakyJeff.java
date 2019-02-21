public class FreakyJeff implements Subscriber, Morph {
	private String time;
	private Publisher clockTower;
	
	public FreakyJeff(Publisher clockTower) {
		this.clockTower = clockTower;
		clockTower.subscribe(this);
	}
	
	public void update(String time) {
		this.time = time;
		morph();
	}
	
	public void morph() {
		if (time.equals("Morning")) {
           	System.out.println("It is " + time 
			+ ", so FreakyJeff makes some grits");
        } else if (time.equals("Midday")) {
            System.out.println("It is: " + time 
			+ ", so FreakyJeff starts growing a tail");
        } else if (time.equals("Evening")) {
            System.out.println("It is: " + time 
			+ ", so FreakyJeff morphs into a clobbering hunberdrine");
        } 
	}
}