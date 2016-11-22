package com.mak.junit.demo;

import java.util.Arrays;

public class AnagramCheck {

	public boolean isAnagram(final String word, final String anagram){  
		
		if(word == null || word.length() == 0) {
			throw new NullPointerException("word variable is empty or null");
		}
	
		if(anagram == null || anagram.length() == 0) {
			throw new NullPointerException("anagram variable is empty or null");
		}
		
        if(word.length() != anagram.length()){
        	throw new NullPointerException("word or anagram does not match");
        }
       
        char[] charFromWord = word.toLowerCase().toCharArray();
        char[] charFromAnagram = anagram.toLowerCase().toCharArray();       
        Arrays.sort(charFromWord);
        Arrays.sort(charFromAnagram);
       
        return Arrays.equals(charFromWord, charFromAnagram);
    }
}
