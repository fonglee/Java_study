
import java.util.Scanner;

public class LiFengTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello world");	
		
		System.out.println("hello world1");	
//		System.out.println("hello world2");	
//		
		Scanner in = new Scanner(System.in);
//		System.out.println("echo:" + in.nextLine());
		System.out.println("2+3=" + 5);
		System.out.println("2+3=" + (2+3));
		
//		遍历数组
//		System.out.println(ArrayTest.getAva());
		
		int[] numbers = {1, 3, 5};
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i] + " ");
		}
		
		int[] a = new int[5];
		a[0] = 10;
		int[] b = a;
		
		b[0] = 15;
		System.out.println(b[0]);
		
		int[] copyA = {1 ,2, 3};
		int[] copyB = new int[copyA.length];
		for(int i = 0; i < copyB.length; i++) {
			copyB[i] = copyA[i];
		}
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Character.isDigit('a'));
		
//		字符串变量
		StringTest.getStringTest();
		
		
		
	}

}
