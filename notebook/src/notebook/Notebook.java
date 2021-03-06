package notebook;

import java.util.ArrayList;
import java.util.HashSet;

public class Notebook {
// 顺序容器
	private ArrayList<String> notes = new ArrayList<String>();

	public void add(String s) {
		notes.add(s);
	}
	
	public void add(String s, int location) {
		notes.add(location, s);

	}
	public int getSize() {
		return notes.size();
	}
	
	public String getNode(int index) {
		return notes.get(index);
	}
	
	public void removeNode(int index) {
		notes.remove(index);
		
	}
	
	public String[] list() {
		String[] ret = new String[notes.size()];
		// for (int i = 0; i < notes.size(); i++) {
		// 	ret[i] = getNode(i);					
		// }	
		// 转换成数组
		notes.toArray(ret);	
		return ret;
		
	}
	
	public static void main(String[] args) {
		Notebook nb = new Notebook();
		nb.add("first");
		nb.add("second");
		// 放在1位置
		nb.add("third", 1);
		System.out.println(nb.getSize());
		System.out.println(nb.getNode(1));
		nb.removeNode(1);
		String[] ret = nb.list();
		for(String s : ret) {
			System.out.println(s);
		}
		
		ArrayList<String> myList = new ArrayList<String>();
		myList.add("lifeng");
		myList.add("lisi");
		for(String k : myList){
			System.out.println(k);
		}
		// 集合容器
		System.out.println("------");
		HashSet<String> mySet = new HashSet<String>();
		mySet.add("first");
		mySet.add("second");
		mySet.add("first");
		
		for(String k : mySet) {
			System.out.println(k);
		}
		// 直接输出容器的元素
		System.out.println(mySet);
		

	}

}
