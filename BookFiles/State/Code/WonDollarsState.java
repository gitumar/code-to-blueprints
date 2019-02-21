public class WonDollarsState implements State {
 
	OldSchoolSlotMachine oldSchoolSlotMachine;
	 
	public WonDollarsState(OldSchoolSlotMachine oldSchoolSlotMachine) {
		this.oldSchoolSlotMachine = oldSchoolSlotMachine;
	}
		   
	public void insertCoin() {
		System.out.println("Please wait, machine is dispensing dollars");
	}
	 
	public void rejectCoin() {
		System.out.println("Chill, you already pulled the lever");
	}
	 
	public void pullLever() {
		System.out.println("Do not pull lever twice!");
	}
	 
	public void payout() {
		oldSchoolSlotMachine.emitDollars();
		if (oldSchoolSlotMachine.getCount() > 0) {
			oldSchoolSlotMachine.setState(
			oldSchoolSlotMachine.getNoCoinState());
		} else {
			System.out.println("Machine is now out of cash");
			oldSchoolSlotMachine.setState(
			oldSchoolSlotMachine.getNoDollarsState());
		}
	}

	public void restockDollars() { }
	 
	public String toString() {
		return "dispensing cash";
	}
}


