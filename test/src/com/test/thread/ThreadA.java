package com.test.thread;

class ThreadA extends Thread
{
       public void run()
         {
              for(int i=1;i<=5;i++)
                {
                      System.out.println("\t From ThreadA: i= "+i);
                      
                      
                      try {
						Thread.sleep(10000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
                }
                 System.out.println("Exit from A");
         }
}

class ThreadB extends Thread
{
       public void run()
         {
              for(int j=1;j<=5;j++)
                {
                      System.out.println("\t From ThreadB: j= "+j);
                }
                 System.out.println("Exit from B");
         }
}

class ThreadC extends Thread
{
       public void run()
         {
              for(int k=1;k<=5;k++)
                {
                      System.out.println("\t From ThreadC: k= "+k);
                }
                 System.out.println("Exit from C");
         }
}