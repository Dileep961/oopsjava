package com.oops;

public class Acessexample {
	
	public static void main(String[] args) {
		
		methodtypes dd = new methodtypes();
		  dd.defaults();
		  dd.protecte();
		  dd.publi();
		  
		  privatee();
		
	}
	private static void privatee() {
		System.out.println("this is private method calling");
	}
}

class methodtypes {
	public void publi() {
		System.out.println("this is public method calling");
	}
protected void protecte() {
	System.out.println("this is protect method calling");
	}
 void defaults() {
	 System.out.println("this is defult method calling");
}
private void privatee() {
	System.out.println("this is private method calling");
}
}
