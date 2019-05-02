package jsm.utility.randomNumber;

import java.util.Random;

public class RandomNumbers extends RandomNumbersVariableGS {

	public RandomNumbers(int min, int max) {
		setMinimumNumber(min);
		setMaximumNumber(max);
		GenerateRandomNumbers();
		printRandomNumber();
	}
	
	public void GenerateRandomNumbers() {
		
		for (int i=0; i<15; i++) {
			RandomNumber();
		}
	}
	
	public void RandomNumber() {
		Random random = new Random();
		
		do {
			setIntResult(random.nextInt(getMaximumNumber() + 1 - getMinimumNumber()) + getMinimumNumber());
		}
		while (listRadmonNumber.contains(getIntResult()) == true); 

		listRadmonNumber.add(getIntResult());		
	}

	@Override
	public void printRandomNumber() {
		for (int i=0; i<listRadmonNumber.size(); i++)
		{
			System.out.print(" ," + listRadmonNumber.get(i));
		}
		
	}


}
