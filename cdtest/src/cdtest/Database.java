package cdtest;

import java.util.ArrayList;

import cdtest.CD;

public class Database {
//	private ArrayList<CD> listCD = new ArrayList<CD>();
//	private ArrayList<DVD> listDVD = new ArrayList<DVD>();
//	
	private ArrayList<Item> listItem = new ArrayList<Item>();
	
	
//	public void add(CD cd) {
//		listCD.add(cd);
//	}
//	
//	public void add(DVD dvd) {
//		listDVD.add(dvd);
//	}
	
	public void add(Item item) {
		listItem.add(item);
	}
	
//	public void list() {
//		for(CD cd :listCD) {
//			cd.print();
//		}
//		for(DVD dvd: listDVD) {
//			dvd.print();
//		}
//	}
	
	public void list() {
		for(Item item : listItem) {
			item.print();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("it is a inherit test");
		Database db = new Database();
		
		db.add(new CD("abcdefg","zhaoqian", 4, 60, "..."));
		
		db.add(new DVD("sd", "Lifeng", 5, "..."));
		db.add(new CD("ffsdfsdf", "wangwu", 5, 60, "..."));
		db.add(new VedioGame("ffsdfsdf", 10, "...", 60));
		db.list();
		
		CD mycd = new CD("abcdefg","zhaoqian", 4, 60, "...");
		mycd.print();
		Item item = (Item)mycd;
		item.print();
		
		System.out.println(mycd.equals(new CD("abcdefg","zhaoqian", 4, 60, "...")));
		
		
		
		
	}

}
