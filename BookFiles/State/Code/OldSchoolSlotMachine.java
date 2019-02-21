public class OldSchoolSlotMachine {
 
	State noDollarsState;
	State noCoinState;
	State coinInsertedState;
	State wonDollarsState;
 
	State state;
	int count = 0;
 
	public OldSchoolSlotMachine(int numberOfDollars) {
		noDollarsState = new NoDollarsState(this);
		noCoinState = new NoCoinState(this);
		coinInsertedState = new CoinInsertedState(this);
		wonDollarsState = new WonDollarsState(this);

		this.count = numberOfDollars;
 		if (numberOfDollars > 0) {
			state = noCoinState;
		} else {
			state = noDollarsState;
		}
	}
 
	public void insertCoin() {
		state.insertCoin();
	}
 
	public void rejectCoin() {
		state.rejectCoin();
	}
 
	public void pullLever() {
		state.pullLever();
		state.payout();
	}
 
	void emitDollars() {
		System.out.println("Make It Rain!");
		if (count != 0) {
			count = count - 50;
		}
	}
 
	int getCount() {
		return count;
	}
 
	void restockDollars(int count) {
		this.count += count;
		System.out.println(
		"The Old School Slot Machine was just filled and new dollar count is: "
		+ this.count);
		state.restockDollars();
	}

	void setState(State state) {
		this.state = state;
	}
	public State getState() {
		return state;
	}

	public State getNoDollarsState() {
		return noDollarsState;
	}

	public State getNoCoinState() {
		return noCoinState;
	}

	public State getCoinInsertedState() {
		return coinInsertedState;
	}

	public State getWonDollarsState() {
		return wonDollarsState;
	}
 
	public String getCurrentState() {
		return "Current Slot Machine State: "
		+ state + "\n";
	}
}
