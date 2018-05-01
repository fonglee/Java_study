import java.util.Scanner;


public class ArrayTest {
	
	private static Scanner in;

	public static double getAva() {
		int cnt = 0;
		double sum = 0;
		double ave = 0.0;
		
		in = new Scanner(System.in);
		cnt = in.nextInt();
		if(cnt > 0) {
			int[] numbers = new int[cnt];
		
			for(int i = 0; i < numbers.length; i++) {
				numbers[i] = in.nextInt();
				sum += numbers[i];
			}
			
			ave = sum / cnt;
			for(int i = 0; i < numbers.length; i++) {
				if(numbers[i] > ave){
					System.out.println(numbers[i]);
				}
			}
		}			
		return ave;	
	}
	
}
