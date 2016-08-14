package cdtest;

public class DVD extends Item{
	private String director;
	
	public DVD(String title, String director, int playingTime, String comment) {
//		调用父类的方法
		super(title, playingTime, comment, false);

		this.director = director;
	}
	
	public void print() {
		System.out.print("DVD: ");
//		调用父类的方法
		super.print();
		System.out.println();
	}
	
	
}
