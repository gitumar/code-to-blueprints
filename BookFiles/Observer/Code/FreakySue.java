public class FreakySue implements Subscriber, Morph {
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
		if (time.equals("Morning")) {
           	System.out.println("It is " + time 
			+ ", so FreakySue makes some oatmeal");
        } else if (time.equals("Midday")) {
            System.out.println("It is: " + time 
			+ ", so FreakySue's nails start lengthening");
        } else if (time.equals("Evening")) {
            System.out.println("It is: " + time 
			+ ", so FreakySue morphs into a pernicious punderbarg ");
        } 
	}
}