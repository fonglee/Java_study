package �����������;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.Vector;

/**
 * ��������ѧУ����һЩͬѧһ����һ���ʾ���飬Ϊ��ʵ��Ŀ͹��ԣ������ü����������N��1��1000֮������������N��1000�������������ظ������֣�ֻ����һ������������ͬ����ȥ������ͬ������Ӧ�Ų�ͬ��ѧ����ѧ�š�Ȼ���ٰ���Щ����С�������򣬰����źõ�˳��ȥ��ͬѧ�����顣����Э��������ɡ�ȥ�ء��롰���򡱵Ĺ�����
 * @author xuanfeng
 *
 */
public class Main {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		
		int count = 0;
		
		while(myScanner.hasNext())
		{
			TreeSet<Integer> mySet=new TreeSet<Integer>();
			count = myScanner.nextInt();
			for(int i = 0; i < count; i++)
			{
				mySet.add(myScanner.nextInt());
				
			}
			
			for(Integer i : mySet)
			{
				System.out.println(i);
			}

		}
		
		

	}



}
