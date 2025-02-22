package com.isko.app.util.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadExample {
	private int a;
	private int b;

	public ThreadExample(int a1, int b1) {
		a = a1;
		b = b1;

	}

	public static void main(String[] args) throws InterruptedException {
		System.out.println("IAM IN MAIN METHOD");

		System.out.println("STARTING SEPARATE THREAD FOR SUB");
		CalcExImpl thread2 = new CalcExImpl(20, 10);

		ExecutorService executor = Executors.newFixedThreadPool(3);

		for (int i = 0; i < 5; i++) {
			executor.execute(thread2);
		}
		executor.shutdown();



		System.out.println("MAIN COMPLETED");

	}

}
