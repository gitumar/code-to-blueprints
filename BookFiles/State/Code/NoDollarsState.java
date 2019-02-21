
public class NoDollarsState implements State {
	OldSchoolSlotMachine oldSchoolSlotMachine;
	 
	public NoDollarsState(OldSchoolSlotMachine oldSchoolSlotMachine) {
		this.oldSchoolSlotMachine = oldSchoolSlotMachine;
	}
	 
	public void insertCoin() {
		System.out.println(
		"You cannot insert a casino coin, the machine is out of money");
	}
	 
	public void rejectCoin() {
		System.out.println("You have not inserted a casino coin");
	}
	 
	public void pullLever() {
		System.out.println(
		"You turned, but there is NO money in the machine");
	}
	 
	public void payout() {
		System.out.println("No money was paid out");
	}
		
	public void restockDollars() { 
		oldSchoolSlotMachine.setState(oldSchoolSlotMachine.getNoCoinState());
	}
 
	public String toString() {
		return "machine is out of cash";
	}
}
