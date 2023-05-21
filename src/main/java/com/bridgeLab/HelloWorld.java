package com.bridgeLab;

public class HelloWorld {

	public static void main(String[] args) {
		String sentance = "The World count jhgjuhg ";
		int wordcount = countWords(sentance);
		System.out.println("word count:" +wordcount);
	}

	private static int countWords(String sentance) {
		// TODO Auto-generated method stub
		if(sentance== null || sentance.isEmpty()) {
			return 0;
		}
		String[] words=sentance.split(sentance);
		return words.length;
		
	}
		
		
    
	}


