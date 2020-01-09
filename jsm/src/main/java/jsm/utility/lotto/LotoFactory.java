package jsm.utility.lotto;

public class LotoFactory {
	
	public LotoNumbers getNumbers(String numberType)
	{
		//TODO:
		// validate null and space check point is working properly.
		if (numberType == null) {
			return null;
		}
		
		switch (numberType) {
		case "regular":
			return new RgularNumbers();
		case "strong":
			return new StrongNumber();
		default:
			return null; 
		}
	} 
} 
