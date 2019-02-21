import java.util.ArrayList;

public class ClockTower implements Publisher {
	private ArrayList<Subscriber> subscribers;
	private String time;
	
	public ClockTower() {
		subscribers = new ArrayList<Subscriber>();
	}
	
	public void subscribe(Subscriber s) {
		subscribers.add(s);
	}
	
	public void unsubscribe(Subscriber s) {
		int i = subscribers.indexOf(s);
		if (i >= 0) {
			subscribers.remove(i);
		}
	}
	
	public void notifySubscribers() {
		for (Subscriber subscriber : subscribers) {
			subscriber.update(time);
		}
	}
	
	public void timeChanged() {
		notifySubscribers();
	}
	
	public void setTimeOfDay(String time) {
		this.time = time;
		timeChanged();
	}

	public String getTime() {
		return time;
	}

}
