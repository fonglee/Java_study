package cdtest;

public class Item {
	
	private String title;
	private int playingTime;
	private String comment;
	private boolean gotIt;
	
	public Item(String title, int playingTime, String comment, boolean gotIt) {
		this.title = title;
		this.playingTime = playingTime;
		this.comment = comment;
		this.gotIt = gotIt;
		
	}
	
//����Ǳ���Ҫ�е�
	public void print() {
		System.out.print(title + " ");
		
	}

//	public void add(Item item) {
//		// TODO Auto-generated method stub
//		
//	}

}