package Ľ��Java;

import java.util.Arrays;

//С����ǣ��������ѧ֪ʶ����дһ�� JAVA ����ʵ��������Գɼ���ǰ����
//
//Ҫ��
//
//1�� ���Գɼ��ѱ��������� scores �У�����Ԫ������Ϊ 89 , -23 , 64 , 91 , 119 , 52 , 73
//
//2�� Ҫ��ͨ���Զ��巽����ʵ�ֳɼ�������������������ɼ�������Ϊ��������

public class HelloWorld {

	public static void main(String[] args) {
		
		int [] scores = {89 , -23 , 64 , 91 , 119 , 52 , 73};
		new HelloWorld().getThreeHeadScores(scores);
	}
	
	//���巽����ɳɼ��������ǰ�����Ĺ���
	private  void getThreeHeadScores(int [] scores)
	{
		int effectScoreCount = 0;
		
		Arrays.sort(scores);
		
		for(int i = scores.length - 1; i >= 0; i--)
		{
			if(scores[i] >= 0 && scores[i] <= 100)
			{
				
				if(effectScoreCount >= 3)
				{
					return ;
				}
				effectScoreCount++;
				System.out.println(scores[i]);				
			}
			
		}
		
		
	}

}
