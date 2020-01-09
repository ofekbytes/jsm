package jsm.utility.lotto;

import java.util.ArrayList;
import java.util.Random;

public class RgularNumbers implements LotoNumbers {

	private int min = 1;
	private int max = 37;
	private int total = 6;
	private ArrayList<Integer> alRegularNumberList = new ArrayList<Integer>();
	
	
	@Override
	public void generate() {
		System.out.println("generate a --> Regular Numbers");
		
		for (int i=min; i<total)
		{
			
		}
		
	}
	
	private int generateRandomNumber()
	{
		int number = 0;
		
		Random r = new Random();
		number = (r.nextInt((max - min) + 1) + min);
		
		
		
	}
}
