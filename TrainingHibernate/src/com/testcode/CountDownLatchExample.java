package com.testcode;

import java.io.FileNotFoundException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Processor implements Runnable {
	private CountDownLatch latch;
	public Processor(CountDownLatch latch){
		this.latch=latch;
	}
	
	public void run(){
		System.out.println("started");
		try{
			Thread.sleep(3000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		latch.countDown();
		System.out.println("=>"+latch.getCount());
	}
}

public class CountDownLatchExample {

	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		CountDownLatch latch =new CountDownLatch(2);
		ExecutorService ser = Executors.newFixedThreadPool(3);
		for (int i = 0; i < 3; i++) {
			ser.submit(new Processor(latch));
			try{
				System.out.println("waiting...");
				Thread.sleep(3000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		try{
			latch.await();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		
		System.out.println("completed..");
		Thread t = Thread.currentThread(); 
		System.out.println("Current thread: " + t.getPriority()); 
	}
}
