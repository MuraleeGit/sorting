/*Based on weight
If the weight is same sort basd on price
If price is same sot with flavour
*/
package com.k2js.constructors.practice;

class Cake{
	
	String flavour;
	int weight;
	double price;
	
	Cake(String flavour, int weight, double price){
		this.falvour=flavour;
		this.weight=weight;
		this.price=price;
	}
	@Override 
	public String toString(){
		String f ="Flavour is"+this.flavour;
		String w="Weight is " +this.weight;
		String p="Price is "+this.price;
		return "Cake details ->" +f+w+p;
	}
	@Override
	public int compareTo(Cake c){
		int weight=this.weight-c.weight;
		int pr=this.price-c.price;
		return(Weight==0)?pr:(pr==0)?this.falvour.compareToIgnoreCase(c.flavour):weight;
	}
}

class CakeTest{
	public static void main(String...abc){
		Cake c1=new Cake("Vanila", 100, 35.00);
		Cake c2=new Cake("choco", 250, 98.00);
		Cake c3=new cake("mango:, 500, 187.00);
		
		Cake [] c={c1,c2,c3,c4};
		Arrays.sort(c);
		System.out.println(Arrays.toString(c));
	}
}
