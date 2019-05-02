package jsm.utility.temp;

import java.util.Random;

public class RandomNumberSdi 
{
	private int minimumNumber;
	private int maximumNumber;
	private int intResult;


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
	
	public RandomNumberSdi() {
		setMinimumNumber(1);
		setMaximumNumber(20);
		//RandomNumber(getMinimumNumber(), getMaximumNumber());
		
		RandomNumber();
		RandomNumber();
		//System.out.println(getIntResult());
	}
	
	public void RandomNumber()	{
		Random random = new Random();
		
		setIntResult(random.nextInt(getMaximumNumber() + 1 - getMinimumNumber()) + getMinimumNumber());
	}

	public void RandomNumber(int minimumNumber, int maximumNumber) 	{
		minimumNumber = this.minimumNumber;
		maximumNumber = this.maximumNumber;
		
		Random random = new Random();
		
		setIntResult(random.nextInt(maximumNumber + 1 - minimumNumber) + minimumNumber);
		
		System.out.println(getIntResult());	
	}

}
