package jsm.utility.lotto;

public class LotoFactory {
	
	public LotoNumbers getNumbers(String numberType)
	{
		if (numberType == null) {
			return null;
		}
		
		switch (numberType) {
		case "regular":
			//System.out.println("output: regular");
			return new RgularNumbers();
		case "strong":
			//System.out.println("output: strong");
			return new StrongNumber();
		default:
			//System.out.println("output: default");
			return null; 
		}
		//return null;
	} 
} 
