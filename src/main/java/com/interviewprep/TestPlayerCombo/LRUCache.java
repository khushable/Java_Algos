package com.interviewprep.TestPlayerCombo;

import java.util.LinkedHashMap;

public class LRUCache<K,V> extends LinkedHashMap<K,V>{
	/**
	 * 
	 */

	private final int size;
	public LRUCache() {
		super(16,0.75f,true);
		size = 3;
	}
	
	
	@Override
	protected boolean removeEldestEntry(java.util.Map.Entry<K, V> eldest) {
		// TODO Auto-generated method stub
		return size() > size;
	}
	public static void main(String[] args){
		checkLRUCache();
	}
	
	 static void checkLRUCache(){
		LRUCache<Integer, Integer> lruCache = new LRUCache<Integer,Integer>();
		lruCache.put(1, 1);
		lruCache.put(2, 2);
		lruCache.put(3, 3);
		lruCache.get(1);	
		lruCache.get(2);		
		lruCache.put(4, 4);		
		
		System.out.println(lruCache);
		
	}

}

