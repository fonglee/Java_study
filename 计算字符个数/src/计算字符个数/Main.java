package �����ַ�����;

import java.util.Scanner;

/**
 * д��һ�����򣬽���һ������ĸ�������Լ��ո���ɵ��ַ�������һ���ַ���Ȼ����������ַ����к��и��ַ��ĸ����������ִ�Сд��
 */

/**
 * 
 * @author xuanfeng
 *
 */
public class Main {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		String inputStr = null;
		String inputChr ;
		
		while(myScanner.hasNext())
		{
			inputStr = myScanner.nextLine();
			inputChr = myScanner.nextLine();
			int count = 0;
			
			for(int i = 0; i < inputStr.length(); i++)
			{
				char currChr = inputStr.charAt(i);
				if(inputChr.equalsIgnoreCase(String.valueOf(currChr)))
				{
					count++;
				}
				
			}
			
			System.out.println(count);
				
		}
		
		myScanner.close();
		
	}

}
