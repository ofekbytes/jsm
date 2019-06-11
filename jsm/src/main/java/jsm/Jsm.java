/**
 * 
 */
package jsm;

import jsm.utility.randomNumber.RandomNumbers;
import jsm.utility.temp.Test;

/**
 * @author Kessler-yaron (jron)
 *
 */
public class Jsm 
{
	// Jsm() constructor
	public Jsm() {
		RandomNumbers rn = new RandomNumbers(1,22);
	}

	// jsm() main() method.
	public static void main(String[] args) {
		Jsm jsm = new Jsm();
		Test t = new Test();
	}
}
