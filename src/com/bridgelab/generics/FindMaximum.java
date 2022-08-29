package com.bridgelab.generics;

public class FindMaximum {

	public  <E extends Comparable<E>> E maximum(E x, E y, E z) {
		
		E max = x; 	// assuming x as largest initially
		if(y.compareTo(max) > 0) {
			max = y;
		}
		if(z.compareTo(max) > 0) {
			max = z;
		}
		System.out.println("Values are : " + x +" "+ y +" "+ z);
		System.out.println("The Max of 3 Values : " + max);
		return max;
	}
	
	
	
}
