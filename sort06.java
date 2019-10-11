//Sorting in des
package com.k2js.sorting.practice;

import java.util.stream.Stream;

abstract class C implements Comparable<C>{
	int i;
	C(int j){
		this.i=j;
	}
	@Override
	public String toString(){
		return "(i="+this.i+")";
	}
	@Override
	public int compareTo(C b){
		return b.i-this.i;
	}
}

class CTest{
	public static void main(String...abc){
		Stream.<C> of(new C(5){},new C(3){}, new C(2){}).sorted().forEach(System.out::println);
	}
}
/*
D:\seleniumtrainingbyJitendra\Practicals\Javapracticals\sorting\src>javac -d ..\bin com\k2js\sorting\practice\sort04.java

D:\seleniumtrainingbyJitendra\Practicals\Javapracticals\sorting\src>java -cp ..\bin  com.k2js.sorting.practice.BTest
[(i=1), (i=4), (i=5), (i=9)]*/

