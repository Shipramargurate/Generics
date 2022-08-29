package com.bridgelab.generics;

public class FindMaximum {

	/*
	 * UC2 - Find maximum in given three float
	 */
	public Float checkMaximum(Float X, Float Y, Float Z) {
		
		Float max = X;
		if(Y.compareTo(max) > 0) {
			max = Y;
		}
		else if(Z.compareTo(max) > 0) {
			max = Z;
		}
		System.out.println(max);
		return max;
	}
	
}
