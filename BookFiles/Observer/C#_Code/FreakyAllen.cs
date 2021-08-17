using System;

public class FreakyAllen : Subscriber, Morph {
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
		if (time.Equals("Morning")) {
           	Console.WriteLine("It is " + time 
			+ ", so FreakyAllen makes a bowl of cereal");
        } else if (time.Equals("Midday")) {
            Console.WriteLine("It is: " + time 
			+ ", so FreakyAllen's right eye starts to twitch");
        } else if (time.Equals("Evening")) {
            Console.WriteLine("It is: " + time 
			+ ", so FreakyAllen morphs into a blood sucking wogglesnort");
        } 
	}
}
