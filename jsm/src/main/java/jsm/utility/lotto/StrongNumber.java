package jsm.utility.lotto;

import java.util.Random;

public class StrongNumber implements LotoNumbers {
	
	private int min = 1;
	private int max = 7;
	private int total = 1; //?? - ONE NUMBER NO VALIDATION NEEDED ???///
	
	
	
	private int NumberGenerated = 0;

	public int getNumberGenerated() {
		return NumberGenerated;
	}

	public void setNumberGenerated(int numberGenerated) {
		NumberGenerated = numberGenerated;
	}

	
	@Override
	public void generate() {
		System.out.println("generate a --> Strong Numbers");
		
		Random r = new Random();
		setNumberGenerated(r.nextInt((max - min) + 1) + min);
		
		
		System.out.print(getNumberGenerated());
	}
	
}
