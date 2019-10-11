//Sorting Program from java 1.8
package com.k2js.sorting.practice;
import static java.util.Arrays.sort;
import java.util.Arrays;

class Asort3{
	public static void m(){
		
		Integer[] i={10, new Integer(20),Integer.valueOf(5),Integer.parseInt("6"), new Integer[]{4,6}[0], new int []{10,15}[1]};
		Object[] o=java.util.stream.Stream.<Integer>of(i).sorted().toArray();
		System.out.println(Arrays.deepToString(o));
	}
}

class AsortTest3{
	public static void main(String...abc){
	Asort3.m();
	}
}
