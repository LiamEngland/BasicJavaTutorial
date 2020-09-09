
public class Application {

	public static void main(String[] args) {
		System.out.println("Hello World");
		
		// Using Variables to store Primitive Data Types.
		
		int myInteger; // Variable declaration.
		
		myInteger = 100; // Variable assignment.
		
		int myInteger2 = 100; // Variable declaration & assignment.
		
		short myShort = 10; // Short variables can hold up to 16 bits of data. Values can range from -32,767 to 32,767.
		
		long myLong = 10000; // Long variables can hold up to 64 bits of data. Values can range up to 2^64-1.
		
		double myDouble = 7.495; // Double values are made for double precision values.
		
		float myFloat = 765.4f; // Float values are the small version of double, but when declared default to double, unless specified with an 'f'.
		
		char myChar = 'f'; // Char values are made to hold a single 16-bit Unicode character.
		
		boolean myBoolean = true; // Boolean values are made to hold either a true or false value.
		
		byte myByte = 1; // Byte types can hold up to 8 bits of data. These can be either negative or positive. Range can go from -128 to 127.
		
		System.out.println(myInteger);
		System.out.println(myInteger2);
		System.out.println(myShort);
		System.out.println(myLong);
		System.out.println(myDouble);
		System.out.println(myFloat);
		System.out.println(myChar);
		System.out.println(myBoolean);
		System.out.println(myByte);
	}
}