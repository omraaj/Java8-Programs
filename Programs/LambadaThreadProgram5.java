package com.java8.programs;

public class LambadaThreadProgram5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runnable rn =()->{
			for(int i=0;i<10;i++) {
				try {
					System.out.println("Thread is running number:"+i+", with priority  = "+Thread.NORM_PRIORITY);
					Thread.sleep(1000);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};
		Thread th = new Thread(rn);
		th.start();
		
	}

}
