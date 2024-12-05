package com.java8.programs;

public class LambdaThreadProgram3 {

	public static void main(String[] args) {
		
		Runnable ra =()->{
		for(int i=0;i<5;i++) {
			try {
				System.out.println("Thread is running");
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		};

		
		Thread t = new Thread(ra);
		t.start();
	}

}
