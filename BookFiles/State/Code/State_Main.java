
public class State_Main {

	public static void main(String[] args) {
		OldSchoolSlotMachine oldSchoolSlotMachine = new OldSchoolSlotMachine(100);

		System.out.println(oldSchoolSlotMachine.getCurrentState());

		oldSchoolSlotMachine.insertCoin();
		oldSchoolSlotMachine.pullLever();

		System.out.println(oldSchoolSlotMachine.getCurrentState());

		oldSchoolSlotMachine.insertCoin();
		oldSchoolSlotMachine.pullLever();
		oldSchoolSlotMachine.insertCoin();
		
		System.out.println(oldSchoolSlotMachine.getCurrentState());
		
		oldSchoolSlotMachine.pullLever();
		
		oldSchoolSlotMachine.restockDollars(100);
		oldSchoolSlotMachine.insertCoin();
		oldSchoolSlotMachine.pullLever();

		System.out.println(oldSchoolSlotMachine.getCurrentState());
	}
}
