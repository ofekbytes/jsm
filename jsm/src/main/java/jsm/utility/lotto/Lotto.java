package jsm.utility.lotto;

public class Lotto {

	public Lotto() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		LotoFactory lotoFactory = new LotoFactory();
		
		LotoNumbers lotoNumbers1 = lotoFactory.getNumbers("regular");
		lotoNumbers1.generate();
		// generate a rundom number
		//TODO print numbers

		
		LotoNumbers lotoStrong1 = lotoFactory.getNumbers("strong");
		lotoStrong1.generate();
		// TODO
		// 1. generate a rundom number
		// 2. print numbers
	}

}
