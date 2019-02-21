
public class NoCoinState implements State {
	OldSchoolSlotMachine oldSchoolSlotMachine;
	 
	public NoCoinState(OldSchoolSlotMachine oldSchoolSlotMachine) {
		this.oldSchoolSlotMachine = oldSchoolSlotMachine;
	}
	 
	public void insertCoin() {
		System.out.println("You inserted a casino coin");
		oldSchoolSlotMachine.setState(oldSchoolSlotMachine.getCoinInsertedState());
	}
	 
	public void rejectCoin() {
		System.out.println("You haven't inserted a casino coin");
	}
	 
	public void pullLever() {
		System.out.println("You turned, but there's no casino coin");
	}
	 
	public void payout() {
		System.out.println("You need to pay first");
	} 
		
	public void restockDollars() { }
	 
	public String toString() {
		return "waiting for a casino coin";
	}
}
