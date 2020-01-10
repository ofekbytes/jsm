package jsm.utility.lotto;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Random;

public class RgularNumbers implements LotoNumbers {

	private int min = 1;
	private int max = 37;
	private int total = 6;
	private ArrayList<Integer> alRegularNumberList = new ArrayList<Integer>();
	
	
	@Override
	public void generate() {
		
		int temp = 0;
		
//		System.out.println("generate a --> Regular Numbers");
		
		for (int i=min; i<= total;)
		{
			temp = generateRandomNumber();
//			if(alRegularNumberList.contains(Integer.valueOf(temp) ) ) {
			
			if(alRegularNumberList.contains(temp) == false )  {
//				System.out.println("not exist >> " + temp);
				System.out.print(temp + ", ");
				alRegularNumberList.add(temp);
				temp = 0;
				i++;
			}
//			else {
//				System.out.println("Exists >> " + temp );
//			}
		}
		
	}
	
	private int generateRandomNumber()
	{
		int number = 0;
		
		Random r = new Random();
		number = (r.nextInt((max - min) + 1) + min);
		
		return number;
		
	}
}
