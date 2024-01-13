package com.javaLearning;

class Vehicle{
	int wheels;
	String type;
	
	Vehicle(int wheels, String type){
		this.wheels = wheels;
		this.type = type;
	}
	public void display(){
		System.out.println(this.wheels+" "+this.type);
	}
}
public class This_I {

	public static void main(String[] args) {
		Vehicle santro = new Vehicle(4,"four-wheeler");
		santro.display();

	}

}
