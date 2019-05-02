package jsm.utility.randomNumber;

import java.util.ArrayList;

public abstract class RandomNumbersVariableGS implements InterfaceRandomNumbers{

	private int minimumNumber;
	private int maximumNumber;
	private int intResult;
	private int totalNumbers;

	public int getMinimumNumber() {
		return minimumNumber;
	}

	public void setMinimumNumber(int minimumNumber) {
		this.minimumNumber = minimumNumber;
	}


	public int getMaximumNumber() {
		return maximumNumber;
	}

	public void setMaximumNumber(int maximumNumber) {
		this.maximumNumber = maximumNumber;
	}

	
	public int getIntResult() {
		return intResult;
	}

	public void setIntResult(int intResult) {
		this.intResult = intResult;
	}
	
}
