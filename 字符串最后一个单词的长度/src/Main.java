import java.util.Scanner;


/*
 ��Ŀ����

�����ַ������һ�����ʵĳ��ȣ������Կո������

��������:
һ���ַ������ǿգ�����С��5000��

�������:
����N�����һ�����ʵĳ��ȡ�

��������:
hello world

�������:
5
*/


public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(scanner.hasNext()) {
			String input = scanner.nextLine();
			
			System.out.println(solve(input));
		}

	}
	
	public static int solve(String input) {
		String[] inputArray = input.split(" ");
		
		return inputArray[inputArray.length-1].length();
	}

}
