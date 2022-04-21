/**
 * 
 */
package jsm.jsmMain;

import java.math.MathContext;

import jsm.utility.*;
import jsm.utility.math.FizzBuzz;
import jsm.utility.math.Reverse;
import jsm.utility.memoryBoxesInformation.memoryBoxesInformation;
import jsm.utility.randomNumber.RandomNumbers;
import jsm.utility.temp.Utf16;

/**
 * @author Kessler-yaron (jron)
 *
 */
public class JsmMain 
{
	// Jsm() constructor
	public JsmMain() {
//		RandomNumbers rn = new RandomNumbers(1,22);		
//		RandomNumbers rn = new RandomNumbers();
//		FizzBuzz fb = new FizzBuzz();
		Reverse reverse = new Reverse(12345);

		//FizzBuzz fb = new FizzBuzz();
		//memoryBoxesInformation mbi = new memoryBoxesInformation();		
	}

	// jsm() main() method.
	public static void main(String[] args) {
		JsmMain jsm = new JsmMain();
//		Test t = new Test();
	}
}
