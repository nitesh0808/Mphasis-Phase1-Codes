package com.mphasis.basics;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CollectionEx {
	public static void main(String[] args) {
		LinkedHashMap<Integer,String> hm=new LinkedHashMap<>();
		hm.put(1,"kk");
		hm.put(2, "pp");
		hm.put(null,null);
		hm.put(3,null);
		
		Set s=hm.entrySet();
		
		Iterator i=s.iterator();
		while(i.hasNext()) {
			//LHS Map= RHS Set
		Map.Entry map=	(Entry) i.next();
		System.out.println(map.getKey()+"   "+map.getValue());
		}
		
		
	}

}










