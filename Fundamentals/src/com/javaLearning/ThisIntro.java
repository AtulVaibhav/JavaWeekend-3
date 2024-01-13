package com.javaLearning;


class Pen{
	Pen(){
		System.out.println("value of this keyword :"+this.hashCode());
	}
}
public class ThisIntro {

	public static void main(String[] args) {
		Pen p = new Pen();
		System.out.println("the value of p:"+p.hashCode());
	}

}
