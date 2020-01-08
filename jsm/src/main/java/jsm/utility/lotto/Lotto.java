package jsm.utility.lotto;

public class Lotto {

	public Lotto() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		LotoFactory lotoFactory = new LotoFactory();
		
		LotoNumbers lotoNumbers1 = lotoFactory.getNumbers("regular");
		lotoNumbers1.generate();
		
		LotoNumbers lotoStrong1 = lotoFactory.getNumbers("strong");
		lotoStrong1.generate();
	}

}
