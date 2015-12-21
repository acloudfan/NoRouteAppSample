package com.acloudfan.noroute;

public class NorouteMain {

	// Main method
	// Simply print the counter to log every 5 seconds
	// cf push --no-route   <<< MAKE SURE You use the no route option
	public static void main(String[] args){
		
		int counter = 0;
		
		while(true){
			//1. Print the value of counter to OUT
			System.out.println("Counter Value = "+counter);
			
			//2. Inrement the counter
			counter++;
			
			//3. Sleep for 5 seconds
			try{Thread.sleep(5000);}catch(Exception e){}
		}
		
	}
}
