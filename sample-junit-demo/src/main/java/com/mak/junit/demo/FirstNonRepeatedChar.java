package com.mak.junit.demo;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstNonRepeatedChar {

	private String noUse;
	
	public char getFirstNonRepeatedChar(final String word) {
        
		if(word == null || word.length() == 0) {
			throw new RuntimeException("word variable is empty or null");
		}
		
		Map<Character,Integer> counts = new LinkedHashMap<Character,Integer>(word.length());
        
        for (char c : word.toCharArray()) {
            counts.put(c, counts.containsKey(c) ? counts.get(c) + 1 : 1);
        }
        
        for (Entry<Character,Integer> entry : counts.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        throw new RuntimeException("didn't find any non repeated Character");
		
    }
}
