package 华为OJ;

import java.util.Scanner;

/*
题目描述

正整数A和正整数B 的最小公倍数是指 能被A和B整除的最小的正整数值，设计一个算法，求输入A和B的最小公倍数。

输入描述:
输入两个正整数A和B。


输出描述:
输出A和B的最小公倍数。

输入例子:
5 
7

输出例子:
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
