public class FreakyAllen implements Subscriber, Morph {
	private String time;
	private Publisher clockTower;
	
	public FreakyAllen(Publisher clockTower) {
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
			+ ", so FreakyAllen makes a bowl of cereal");
        } else if (time.equals("Midday")) {
            System.out.println("It is: " + time 
			+ ", so FreakyAllen's right eye starts to twitch");
        } else if (time.equals("Evening")) {
            System.out.println("It is: " + time 
			+ ", so FreakyAllen morphs into a blood sucking wogglesnort");
        } 
	}
}
