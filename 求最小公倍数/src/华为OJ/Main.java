package ��ΪOJ;

import java.util.Scanner;

/*
��Ŀ����

������A��������B ����С��������ָ �ܱ�A��B��������С��������ֵ�����һ���㷨��������A��B����С��������

��������:
��������������A��B��


�������:
���A��B����С��������

��������:
5 
7

�������:
35

*/
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(scanner.hasNext()) {
			int numA = scanner.nextInt();
			int numB = scanner.nextInt();
			System.out.println(numA * numB / solveGcd(numA, numB));
		}
		
	}
	
	public static int solveGcd(int numA, int numB) {
		if(numA < numB) {
			int tmp = numA;
			numA = numB;
			numB = tmp;
		}
		
		while(numA % numB != 0) {
			int tmp = numB;
			numB = numA % numB;
			numA = tmp;
		}
		
		return numB;
	}

}
