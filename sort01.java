//Equals 
package com.k2js.sorting.practice;

class Asort{
	public static void m(){
		Integer[] i= {6,7,8,9,1,2,3,4};
		java.util.Arrays.sort(i);
		for(Integer t:i) System.out.println(t);
	}
}

class AsortTest{
	public static void main(String...abc){
	Asort.m();
	}
}