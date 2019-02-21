public class CoinInsertedState implements State {
	OldSchoolSlotMachine oldSchoolSlotMachine;
	 
	public CoinInsertedState(OldSchoolSlotMachine oldSchoolSlotMachine) {
		this.oldSchoolSlotMachine = oldSchoolSlotMachine;
	}
	  
	public void insertCoin() {
		System.out.println("You cannot insert another casino coin");
	}
	 
	public void rejectCoin() {
		System.out.println("Casino coin returned");
		oldSchoolSlotMachine.setState(oldSchoolSlotMachine.getNoCoinState());
	}
	 
	public void pullLever() {
		System.out.println("You pulled the lever...");
		oldSchoolSlotMachine.setState(oldSchoolSlotMachine.getWonDollarsState());
	}

	public void payout() {
		System.out.println("No dollars dispensed");
	}
		
	public void restockDollars() { }
	 
	public String toString() {
		return "waiting for lever pull";
	}
}
