package com.isko.app.util.threads;

public class CalcExThread extends Thread 
{
	private int a;
	private int b;

	
	public CalcExThread(int x, int y ) 
	{
		a = x;
		b = y;
		
	}

	
	public void run()
	{
		sum();
	}
	
	
	public void sum() 
	{
		try {
			Thread.sleep(30900);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("SUM" + (a + b));
	}




}
