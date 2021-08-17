using System;
public class FreakySue : Subscriber, Morph  {
	private String time;
	private Publisher clockTower;
	
	public FreakySue(Publisher clockTower) {
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
			+ ", so FreakySue makes some oatmeal");
        } else if (time.Equals("Midday")) {
            Console.WriteLine("It is: " + time 
			+ ", so FreakySue's nails start lengthening");
        } else if (time.Equals("Evening")) {
           	Console.WriteLine("It is: " + time 
			+ ", so FreakySue morphs into a pernicious punderbarg ");
        } 
	}
}