package com.oops;

import java.util.LinkedList;

public class Linkedlist {
	public static void main(String[] args) {

		LinkedList credo = new LinkedList<>();

		credo.add("tea");
		credo.add("bonda");
		credo.add("samosa");
		credo.add("lolipop");
		credo.add("vada ");

//	 		System.out.println(credo);

		LinkedList credo1 = new LinkedList<>();
		credo1.addAll(credo);

		System.out.println(credo1);
		credo1.addFirst("steve");
		credo1.addLast("credosystem");
		System.out.println(credo1);
	}

}
