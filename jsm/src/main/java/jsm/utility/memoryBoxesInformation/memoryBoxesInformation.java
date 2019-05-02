package jsm.utility.memoryBoxesInformation;

public class memoryBoxesInformation 
{

	/*
	 * fnPrimitiveVariable() - print Primitive Variable value.
	 */
	public void fnPrimitiveVariable()
	{
		System.out.println("\nVariable / Atributes:");
		
		System.out.println("Byte (8 bit / 1 byte) == " + Byte.MIN_VALUE + " <--> " + Byte.MAX_VALUE);  
		System.out.println("Short (16 bit / 2 byte) == " + Short.MIN_VALUE + " <--> " + Short.MAX_VALUE); 
		System.out.println("int / Integer (32 bit / 4 byte) == " + Integer.MIN_VALUE + " <--> " + Integer.MAX_VALUE);
		System.out.println("Long (64 bit / 8 byte)  == " + Long.MIN_VALUE + " <--> " + Long.MAX_VALUE);	
		System.out.println("char / Character (16 bit / 2 byte)  == " + Character.MIN_VALUE + " <--> " + Character.MAX_VALUE);
		
        System.out.println("Float (32 bit / 4 byte) == " + Float.MIN_VALUE + " <--> " + Float.MAX_VALUE);
        System.out.println("Double (64 bit / 8 byte) == " + Double.MIN_VALUE + " <--> " + Double.MAX_VALUE);
	}

	/*
	 * memoryBoxesInformation() constructor
	 */
	public memoryBoxesInformation() 
	{
		fnPrimitiveVariable();
	}

}
