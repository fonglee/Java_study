package cdtest;

public class DVD extends Item{
	private String director;
	
	public DVD(String title, String director, int playingTime, String comment) {
//		���ø���ķ���
		super(title, playingTime, comment, false);

		this.director = director;
	}
	
	public void print() {
		System.out.print("DVD: ");
//		���ø���ķ���
		super.print();
		System.out.println();
	}
	
	
}