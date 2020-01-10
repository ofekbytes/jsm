package jsm.utility.lotto;

public class Lotto {

	public Lotto() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		System.out.println("Israel lottery Numbers are: ");
		
		LotoFactory lotoFactory = new LotoFactory();
		
		LotoNumbers lotoNumbers1 = lotoFactory.getNumbers("regular");
		lotoNumbers1.generate();
		
		LotoNumbers lotoStrong1 = lotoFactory.getNumbers("strong");
		lotoStrong1.generate();
		
		
//		for (int i=0; i<=3; i++) {
//			System.out.println("");
//			lotoNumbers1.generate();
//			lotoStrong1.generate();
//		}
//			System.out.println("");
//			lotoNumbers1.generate();
//			lotoStrong1.generate();
//		}
	}

}
