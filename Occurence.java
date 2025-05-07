package com.oops;

public class Occurence {
	public static void main(String[] args) {
		
//		        String str = "hello world";
//		        int[] o = new int[256];
//
//		        for (int i = 0; i < str.length(); i++) {
//		            char c = str.charAt(i);
//		            if (c >= 0 && c < 256) { 
//		                o[c]++;
//		            }
//		        }
//
//		        System.out.println("Character Occurrences:");
//		        for (int i = 0; i < o.length; i++) {
//		            if (o[i] > 0) {
//		                System.out.println((char) i + ": " + o[i]);
//		            }
		
		String str1 = "p r o g r a m";
		String[]str2=str1.split(" ");

		for(int i=0;i<str2.length;i++) {

			int count=1;

			for(int j=i+1;j<str2.length;j++) {

				if(str2[i].equals(str2[j])) {

				count++;

				str2[j]="";

			}

		}

		if(str2[i]!="") {

			System.out.println(str2[i]+":"+count);
	 
		        }
		    }
}
}