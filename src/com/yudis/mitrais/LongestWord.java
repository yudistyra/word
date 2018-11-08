package com.yudis.mitrais;

public class LongestWord {
	public static void main(String[] args) {
		String word = "How to solve this codess yourself";
		
		String[] arr = word.split(" ");
		String longest = "00";
		int temp = 0;
		
		if(arr.length > 0) {
			for(int i=0;i<arr.length;i++) {
				int l = arr[i].length();
				if((l % 2) == 0 ) {
					if(temp < arr[i].length()) {
						longest = arr[i];
						temp = arr[i].length(); 
					}
				}
			}
		}
		
		System.out.println(longest);
	}
}
