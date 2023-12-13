package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class list {
	static ArrayList<Integer> numbers = new ArrayList<Integer>();
	
	public static void addEle() {
		numbers.add(10);
		
		numbers.add(10);
		
		System.out.println(numbers.contains(10));
		System.out.println(numbers.contains(1));
		System.out.println(numbers.get(0));//getValue
		System.out.println(numbers.size());
		numbers.set(0, 20);//setValue
		System.out.println("First Ele after changing value:"+numbers.get(0));
		
		Iterator itr = numbers.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		Collections.sort(numbers);
		System.out.println("Sorted numbers:");
		for(int i:numbers) {
			System.out.println(i);
		}
		ArrayList<String> strList = new ArrayList<String>();
		strList.add("Mango");
		strList.add("Apple");
		
		Iterator itrt = strList.iterator();
		while(itrt.hasNext()) {
			System.out.println(itrt.next());
		}
		
		Collections.sort(strList);
		System.out.println("Sorted string list:");
		for(String i:strList) {
			System.out.println(i);
		}
		//strList.clear();

	}
	
	public static void main(String[] args) {
		addEle();
	}
	
	
}
