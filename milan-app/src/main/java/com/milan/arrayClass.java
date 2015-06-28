package com.milan;

public class arrayClass {
	int[] studentId={1,10,20,30,30,30,30,1,1,1,1,1,1,1};
	//int[] countscount=new int[10];
	public static void main(String[] args)
	{
		arrayClass ac=new arrayClass();
		ac.countingNoTimes();
		//ac.maximumnum();
	
	
	}
	void countingNoTimes()
	{
		
		int count=1;
		int maxCount=0;
		int maxElement=0;
		
		for (int i = 0; i <studentId.length-1; i++)
		{
			for(int j=i;j<studentId.length-1;j++)
			{
				//System.out.println(studentId[j]);
				if(studentId[i]==studentId[j])
				{
					count++;
				}
			
			}
			if(maxCount<count)
			{
				maxCount=count;
				maxElement=i;
			}
			count=1;

			//countscount[i]=count;
			//count=1;	
		}
		System.out.println("Maximun Occurence is "+maxCount+" with element"+studentId[maxElement]);
		}

	//public void maximumnum()
	//{
		//int max=countscount[0];
		//int index=0;
		//for(int i=0;i<countscount.length;i++)
		//{
			//if(max<countscount[i])
			//{
				//max=countscount[i];
				//index=i;
			//}
		//}
		//System.out.println("maximum of "+max+" times with student id "+studentId[index]);
	
	//}

}
