package cdtest;

public class VedioGame extends Item {
	private int numberOfPlayer;
	
	public VedioGame(String title, int playingTime, String comment,
			int numberOfPlayer) {
		super(title, playingTime, comment, false);
		this.numberOfPlayer = numberOfPlayer;
		
		// TODO Auto-generated constructor stub
	}
	
	public void print() {
		System.out.print("Vedio Game:");
		super.print();
		System.out.println();
	}

}
