import java.util.Scanner;


public class StringTest {
	
	private static Scanner in;

	public static boolean getStringTest() {
		String s = new String("Hello world");
		System.out.println(s+(12+24));
		in = new Scanner(System.in);
		String inputString = "0123456";
//		读入一个行
//		inputString = in.nextLine();
//		读入一个单词
//		inputString = in.next();
		System.out.println(inputString);
		
		System.out.println(inputString.equals("hello"));
		
		System.out.println(inputString.compareTo("a"));
		
		System.out.println(inputString.charAt(0));
		System.out.println(inputString.substring(2));
		
		System.out.println(inputString.substring(2, 4));
		System.out.println(inputString.indexOf('0'));
		System.out.println(inputString.indexOf('9'));
		
		return false;
		
	}

}
