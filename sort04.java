//Sorting Program from java 1.8
package com.k2js.sorting.practice;
import static java.util.Arrays.sort;
import java.util.Arrays;

class B implements Comparable<B>{
	int i;
	B(int i){
		this.i=i;
	}
	@Override
	public String toString(){
		return "(i="+this.i+")";
	}
	@Override
	public int compareTo(B b){
		return (this.i<b.i)?-1:(this.i>b.i)?1:0;
	}
}
class BTest{
	public static void main(String...abc){
		B[] allB={new B(5),new B(4),new B(9), new B(1)};
		Arrays.sort(allB);
		System.out.println(Arrays.deepToString(allB));
		System.out.println(Arrays.toString(allB));
	}
}

/*
D:\seleniumtrainingbyJitendra\Practicals\Javapracticals\sorting\src>javac -d ..\bin com\k2js\sorting\practice\sort04.java

D:\seleniumtrainingbyJitendra\Practicals\Javapracticals\sorting\src>java -cp ..\bin  com.k2js.sorting.practice.BTest
[(i=1), (i=4), (i=5), (i=9)]*/

