//Sorting in des
package com.k2js.sorting.practice;

class NewsPaper implements Comparable<NewsPaper>{
	String name;
	int pages, price;
	
	NewsPaper(String name, int pages){
		this.name=name;
		this.pages=pages;
	}
	NewsPaper(String name, int pages, int price){
		this(name,pages);
		this.price=price;
	}
	@Override
	public String toString(){
		String n="Name is :"+this.name+"\t";
		String pa="pages is "+this.pages+"\t";
		String p ="price"+((this.price!=0)?this.price:"price not available"+"\t");
		return "newspaper details"+n+pa+p;
	}
	@Override
	public int compareTo(NewsPaper p){
		return this.pages-p.pages;
	}
	
}

class NewspaperTest{
	public static void main(String...abc){
		NewsPaper n1=new NewsPaper("Times of India", 21);
		NewsPaper n2=new NewsPaper("Hindu",22, 6);
		NewsPaper n3=new NewsPaper("Mathrubhumi",18,8);
		
		NewsPaper[] p={n1,n2,n3};
		Arrays.sort(p);
		System.out.println(Arrays.deepToString(p));
	}
}

/*
There is some problem with the program.I need to correct this.
*/

