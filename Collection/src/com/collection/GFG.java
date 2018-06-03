package com.collection;
class Bike{  
  void run(){System.out.println("running");}  
}  
class Splender extends Bike{  
  void run(){System.out.println("running safely with 60km");}  
  
 }
 public class GFG{
 public static void main(String args[]){  
	 Splender splender = new Splender();
	 splender.run();
	 
	 Bike bike = new Splender();
	 bike.run();
  }  
 }