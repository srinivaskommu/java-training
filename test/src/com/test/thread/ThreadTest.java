package com.test.thread;

public class ThreadTest {

	public static void main(String[] args) {
		ThreadA threadA = new ThreadA();
		ThreadB threadB = new ThreadB();
		ThreadC threadC = new ThreadC();
		
		threadA.start();
		threadB.start();
		threadC.start();

	}

}
