package collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class map {
	public static void main(String[] args) {
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		
		map.put(1, null);
		map.put(1, null);
		map.put(2, "red");
		map.put(3, "red");
	
		for(Map.Entry m : map.entrySet()){    
		    System.out.println(m.getKey()+" "+m.getValue());    
		} 
		
		LinkedHashMap<Integer,String> lmap = new LinkedHashMap<Integer,String>();
		
		lmap.put(1, null);
		lmap.put(5, null);
		lmap.put(2, "red");
		lmap.put(4, "orange");
		lmap.put(3, "yellow");
		lmap.put(null, "yellow");
	
		for(Map.Entry m : lmap.entrySet()){    
		    System.out.println(m.getKey()+" "+m.getValue());    
		} 
		
		TreeMap<Integer,String> tmap = new TreeMap<Integer,String>();
		
		tmap.put(1, null);
		tmap.put(1, null);
		tmap.put(4, "orange");
		tmap.put(2, "red");
		tmap.put(3, "red");
	
		for(Map.Entry m : tmap.entrySet()){    
		    System.out.println(m.getKey()+" "+m.getValue());    
		} 
	}
}
