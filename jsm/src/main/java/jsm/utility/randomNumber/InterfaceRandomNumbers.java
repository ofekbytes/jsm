/**
 * Interface - InterfaceRandomNumbers
 */
package jsm.utility.randomNumber;

import java.util.ArrayList;

/**
 * @author yaron
 *
 */
public abstract interface InterfaceRandomNumbers {

	int minimumNumber=0;
	int maximumNumber=0;
	int totalNumbers=0;
	int intResult=0;
	//int totalNumbers=0;
	
	ArrayList<Integer> listRadmonNumber = new ArrayList<Integer>();

	void printRandomNumber();
}
