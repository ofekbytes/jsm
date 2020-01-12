package jsm.utility.lotto;

public class Lotto {

	/*
	 * execute() - method (run loto once)
	 */
	private void execute() {
		
		LotoFactory lotoFactory = new LotoFactory();
		
		LotoNumbers lotoNumbers1 = lotoFactory.getNumbers("regular");
		lotoNumbers1.generate();
		
		LotoNumbers lotoStrong1 = lotoFactory.getNumbers("strong");
		lotoStrong1.generate();
	}


//	/*
//	 * Lotto() --> constructor. (run once)
//	 */
//	public Lotto() {
//		LotoFactory lotoFactory = new LotoFactory();
//		
//		LotoNumbers lotoNumbers1 = lotoFactory.getNumbers("regular");
//		lotoNumbers1.generate();
//		
//		LotoNumbers lotoStrong1 = lotoFactory.getNumbers("strong");
//		lotoStrong1.generate();
//	}

	/* 
	 * main() - lets start.
	 * 
	 * Lotto program uses the technology : design pattern - "Factory Pattern".
	 */
	public static void main(String[] args) {
		
		System.out.println("Israel lottery Numbers are: ");
		String add = "0"; 
		Lotto lotto = new Lotto();
		
//		System.out.println("");
		for (int i=0; i<14; i++) {		
			System.out.println("");
			System.out.printf("..%s%d..", add, (i+1));
			lotto.execute();
			
			// add "0" to number smaller then 10.
			if ((i+1) < 9)
				  add = "0";
				else
				  add = "";
		}

	}

}
