package cdtest;

public class CD extends Item{

	private String artist;
	private int numofTracks;
	
	public CD(String title, String artist, int numofTracks, int playingTime,
			String comment) {
//		调用item的构造器
		super(title, playingTime, comment, false);
		this.artist = artist;
		this.numofTracks = numofTracks;
	}

	public void print() {
		System.out.print("CD: ");
		super.print();
		System.out.println();
		
	}

	@Override
	public String toString() {
		return "CD [artist=" + artist + ", numofTracks=" + numofTracks
				+ ", toString()=" + super.toString() + "]";
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		CD cc = (CD) obj;
		return artist.equals(cc.artist);
	}
	
	
	
	
}
