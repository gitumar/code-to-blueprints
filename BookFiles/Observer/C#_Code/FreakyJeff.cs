using System;
public class FreakyJeff: Subscriber, Morph {
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
		if (time.Equals("Morning")) {
           	Console.WriteLine("It is " + time 
			+ ", so FreakyJeff makes some grits");
        } else if (time.Equals("Midday")) {
            Console.WriteLine("It is: " + time 
			+ ", so FreakyJeff starts growing a tail");
        } else if (time.Equals("Evening")) {
           Console.WriteLine("It is: " + time 
			+ ", so FreakyJeff morphs into a clobbering hunberdrine");
        } 
	}
}