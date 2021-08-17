using System;
using System.Collections.Generic;

public class ClockTower : Publisher {
	private List<Subscriber> subscribers;
	private String time;
	
	public ClockTower() {
		subscribers = new List<Subscriber>();
	}
	
	public void subscribe(Subscriber s) {
		subscribers.Add(s);
	}
	
	public void unsubscribe(Subscriber s) {
		int i = subscribers.IndexOf(s);
		if (i >= 0) {
			subscribers.RemoveAt(i);
		}
	}
	
	public void notifySubscribers() {
		foreach (Subscriber subscriber in subscribers) {
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
