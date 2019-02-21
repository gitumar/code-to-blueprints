public interface Publisher {
	public void subscribe(Subscriber s);
	public void unsubscribe(Subscriber s);
	public void notifySubscribers();
}
