package com.bridgelab.generics;

public class FindMaximumMain {

	/*
	 * Refactor- all 3 to one generic method and find the maximum
	 */

	public static void main(String[] args) {
		
		FindMaximum max = new FindMaximum();
		System.out.println("Maximumn in given Strings is :\n");
		max.maximum(33, 333, 3333);
		System.out.println();
		max.maximum(1.1, 2.2, 3.3);
		System.out.println();
		max.maximum("xyz", "pqr", "uvw");
	}

}
