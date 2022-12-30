package com.fibonacci.series;

public class FibonacciExample2 {
	
  static int n1=0 ,n2=1,n3=0;
  
  static void displayFibonacci(int count)
  {
	  if (count>0)
	  {
		  n3=n1+n2;
		  n1 = n2;
		  n2=n3;
		  
		  System.out.print(" " + n3);
		  
		  displayFibonacci(count-1);
	  }
  }
	
	
	

	public static void main(String[] args) {
		
		int count=10;
		System.out.print(n1 + " " + n2); // here we are printing 2 numbers
		
		displayFibonacci(count-2); // n-2 because we are already printing two numbers
		
		

	}

}
