package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class set {

	public static void main(String[] args) {
		HashSet<Integer> hSet = new HashSet<Integer>();
		hSet.add(2);
		hSet.add(3);
		hSet.add(2);//it allows but will not add duplicate value
		hSet.add(null);
		hSet.add(null);//does not allow to add more than one null value
		System.out.println(hSet.size());
		
		Iterator itr = hSet.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		LinkedHashSet<Integer> lhSet = new LinkedHashSet<Integer>();
		lhSet.add(20);
		lhSet.add(null);
		lhSet.add(null);
		
		lhSet.add(45);
		lhSet.add(null);
		
		System.out.println(lhSet.size());
		
		Iterator itrt = lhSet.iterator();
		while(itrt.hasNext()) {
			System.out.println(itrt.next());
		}
		
		TreeSet<Integer> tSet = new TreeSet<Integer>();
		tSet.add(20);
		//tSet.add(null);
		
		tSet.add(45);
		tSet.add(45);
		
		tSet.add(30);

		//tSet.add(null);
		
		System.out.println(tSet.size());
		
		Iterator itrtr = tSet.iterator();
		while(itrtr.hasNext()) {
			System.out.println(itrtr.next());
		}
	}
}
