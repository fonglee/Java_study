import java.util.Scanner;


//
//��Ŀ����
//
//����24����һ���˿���������Ϸ��������4���˿��ƣ�ͨ����(+)����(-)����(*), ��(/)�������㷨�����õ�����24��
//�������У��˿���ͨ�������ַ������ַ�����ʾ�����У�Сдjoker��ʾС������дJOKER��ʾ������
//               3 4 5 6 7 8 9 10 J Q K A 2 joker JOKER
//������Ҫ��ʵ�֣�����4���ƣ����һ����ʽ����ʽ�Ľ��Ϊ24�㡣
//��ϸ˵����
//1.����ֻ���ǼӼ��˳����㣬û�н׳˵�����������ţ��������ѣ���������Ҫ���ģ�
//2.����2~10��Ӧ��ȨֵΪ2~10, J��Q��K��AȨֵ�ֱ�ΪΪ11��12��13��1��
//3.����4����Ϊ�ַ�����ʽ����һ���ո��������β�޿ո���������4�����а�����С����������ַ�����ERROR������ʾ�޷����㣻
//4.�������ʽ��ʽΪ4����ͨ��+-*/�ĸ�������������м��޿ո�4���Ƴ���˳�����⣬ֻҪ�����ȷ��
//5.�����ʽ������˳��������ң����������ţ���1+2+3*4�Ľ��Ϊ24
//6.������ڶ�����ʽ���ܼ���ó�24��ֻ�����һ�ּ��ɣ�����޷��ó�24���������NONE����ʾ�޽⡣
//��������
//
//����4����Ϊ�ַ�����ʽ����һ���ո��������β�޿ո�
//�������
//
//��������4�����а�����С����������ַ�����ERROR������ʾ�޷����㣻
//��������
//
//A A A A
//�������
//
//NONE
//

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextLine()) {
			String input = scanner.nextLine();
			System.out.println(solve(input));
			
		}
		
	}
	
	public static String solve(String input) {
		
		if(input == null || input.contains("joker") 
				|| input.contains("JOKER")) {
			return "ERROR";
			
		}
		
		String[] parts = input.split("\\s+");
		if(parts.length != 4) {
			return "ERROR";
		}
		
		int[] nums = new int[parts.length];
		for(int i = 0; i < nums.length; i++) {
			if( parts.equals("Q"))
			nums[i] = Integer.parseInt(parts[i]);
			
		}
		
		
		return input;
		
		
	}

}
