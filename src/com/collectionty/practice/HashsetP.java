package com.collectionty.practice;

import java.util.HashSet;

public class HashsetP {

	public static void main(String[] args) {
		
		HashSet hs=new HashSet(10 , 0.90f);
		hs.add(2);
		hs.add(4);
		hs.add(12);
		hs.add(17);
		System.out.println(hs.add(2));
		System.out.println(hs.add(17));
		System.out.println(hs);
		
		
		

	}

}
