package com.oops;

public class Singleinherientce {

	public static void main(String[] args) {
//        single obj = new single();
//        obj.dosa(5, 10);
//        int result = obj.hotel();
//        System.out.println("The product of sweet and honey is: " + obj.hotel());

//        
//        derive dd = new derive();
//        dd.dosa(10,10);
//        dd.steve();
//        System.out.println(dd.hotel());
//        
        son dd = new son();
        dd.dosa(10,10);
        dd.steve();
        dd.multi();
        System.out.println(dd.hotel());
	}

}
class single{
	int sweet, honey;
	void dosa(int x,int y) {
	sweet = x;
	honey = y;
	}
	int hotel() {
		int z =sweet*honey;
		return z;
	}
}
class derive extends single {

	void steve() {
		System.out.println("sample single inheritence");
	}
}
class son extends derive{
	public void multi() {
		System.out.println("this is multilevel-inheritence  .....");
	}
	
}