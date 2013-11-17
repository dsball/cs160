//P2 Assignment
//Author: Daniel Ball
//Date:   Sep 5, 2013
//Class:  CS160
//Email:  dsball@rams.colostate.edu

public class P2 {
	public static void main(String[] args) {
		int myInt = 123456;
		byte myByte = 48;
		short myShort = 21478;
		long myLong = 8777666555L;
		float myFloat = 0.1F;
		double myDouble = 13.579;
		char char1 = '%';
		char char2 = 'G';
		char char3 = '6';		
		
		String string1 = "Computer";
		String string2 = "Science";
		String string3 = "Excellent";
		System.out.println(myByte + "," + myShort + "," + myInt + "," + myLong );
		System.out.println(myFloat  + "," + myDouble);
		System.out.println((myInt + myByte + myShort + myLong)/1000000);
		System.out.println(Math.sqrt(myFloat*myDouble));
		System.out.println(myInt/myDouble);
		System.out.println(char1 + ":" + char2  + ":" + char3);
		System.out.println((++char1) + ";" + (++char2)  + ";" + (++char3));
		System.out.println(string1 + " " + string2 + " is " + string3+ "!");
		System.out.println(string1.length() + "," + string2.length() + "," + string3.length());
		System.out.println(string1.toUpperCase());
		System.out.println(string2.substring(1, 6));
		System.out.println(string3.indexOf('l'));
		System.out.println(string1.charAt(3));
	}

}
