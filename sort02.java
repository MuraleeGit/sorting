//Sorting Program
package com.k2js.sorting.practice;
//import static java.util.Arrays.sort;
	import java.util.Arrays;

class Asort2{
	public static void m(){
		
		Integer[] i={10, new Integer(20),Integer.valueOf(5),Integer.parseInt("6"), new Integer[]{4,6}[0], new int []{10,15}[1]};
		Object[] o=Arrays.stream(i).sorted().toArray();
		System.out.println(Arrays.deepToString(o));
	}
}

class AsortTest2{
	public static void main(String...abc){
	Asort2.m();
	}
}