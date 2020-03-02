package jsm.utility.math;

public class Reverse {

	// constructor //
	public Reverse() {
		ReversePrimitiveNumber(123456);
	}

	// constructor + argument //
	public Reverse(int sourceNumber) {
		ReversePrimitiveNumber(sourceNumber);
	}

	/**
	 **
	 ** @param sourceNumber
	 **/
	private void ReversePrimitiveNumber(int sourceNumber) {
		int totalDigits = 0;
		int tragetNumber = 0;

		System.out.println("The primitive number Entered: " + sourceNumber);
		
		totalDigits = countTotalDigitsInNumber(sourceNumber);
		tragetNumber = reverseNumber (totalDigits, sourceNumber);
		
		System.out.println("The primitive number Entered After reverse: " + sourceNumber +  "  "  + tragetNumber); 
	}
	
	
	
	
	
	private int reverseNumber(int totalDigits, int sourceNumber) {
		
		int srcNumber = sourceNumber;
		int returnNumber = 1;
		int currentDigit = 0;
		
		for (int number=totalDigits; number>0; number--) {
			
			currentDigit = srcNumber % 10;
			
			returnNumber = (returnNumber * (number * 10));
			
			srcNumber = srcNumber / 10; 
			
			System.out.println("currentDigit >> " + currentDigit);
			
			
			
		}
		
		return returnNumber;
	}

	
	/**
	 **
	 ** @param source - a number entered by the user.
	 ** @return int - total Digits.
	 **/
	private int countTotalDigitsInNumber(int source) {

		int totalDigits = 0;

		while (source > 0) {

			source = source / 10;
			totalDigits++;
		}
		System.out.println("source: " + source + "  have total Digits: " + totalDigits);
		return totalDigits;
	}

}// class
