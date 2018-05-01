package 计算字符个数;

import java.util.Scanner;

/**
 * 写出一个程序，接受一个有字母和数字以及空格组成的字符串，和一个字符，然后输出输入字符串中含有该字符的个数。不区分大小写。
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
