package coins;

import java.util.HashMap;

public class Coin {
	private HashMap<Integer, String> coinnames = new HashMap<Integer, String>();
	
	public Coin() {
//		�����ֵ��
		coinnames.put(1, "penny");
		coinnames.put(10, "dime");
//		���Hash���Ĵ�С
		System.out.println(coinnames.keySet().size());
		System.out.println(coinnames);
//		��������hash��
		for(Integer k : coinnames.keySet()) {
			String s = coinnames.get(k);
			System.out.println(s);
		}
	
	
	}
	
	public String getName(int amount) {
//		�Ƿ����key
		if(coinnames.containsKey(amount)){
			return coinnames.get(amount);
		}
		else {
			return  "not found";
		}
		
	}
	
	public static void main(String[] args) {
		Coin coin = new Coin();
		String name = coin.getName(12);
		System.out.println(name);

	}

}