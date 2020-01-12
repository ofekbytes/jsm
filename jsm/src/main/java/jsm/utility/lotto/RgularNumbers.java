package jsm.utility.lotto;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Random;

public class RgularNumbers implements LotoNumbers {

	private int min = 1;
	private int max = 37;
	private int total = 6;
	private ArrayList<Integer> alRegularNumberList = new ArrayList<Integer>();
	
	
	/*
	 * generate() - Generate 6 regular numbers, using a loop and generateRandomNumber() method.
	 * @see jsm.utility.lotto.LotoNumbers#generate()
	 */
	@Override
	public void generate() {
		
		int temp = 0;
			
		for (int i=min; i<= total;)
		{
			temp = generateRandomNumber();
			
			if(alRegularNumberList.contains(temp) == false )  {
//				System.out.print(temp + ", ");
				System.out.printf("[%3d], ", temp);
				alRegularNumberList.add(temp);
				temp = 0;
				i++;
			}
		}
		
	}
	
	/*
	 * generateRandomNumber() - generate Random Number. 
	 */
	private int generateRandomNumber()
	{
		int number = 0;
		
		Random r = new Random();
		number = (r.nextInt((max - min) + 1) + min);
		
		return number;		
	}
	
} //class//
