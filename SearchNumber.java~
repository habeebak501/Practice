package com.bridgelab.utilityFile;
import com.bridgelab.utilityFile.UtilityFile;
public class SearchNumber
{
	public static void main(String[] args)
	{
		UtilityFile ui=new UtilityFile();
		 SearchNumber sc=new SearchNumber();
		System.out.println("enter the n value:");
		int n=ui.inputInteger();
		int range=(int)Math.pow(2,n)-1;
		System.out.println(range);
		int lower=0;
		int upper=range;
		int middle=(lower+upper)/2;
		int count=0;
		sc.binarySearch(lower, upper,middle, count, n);

	}

public void binarySearch(int lower,int upper,int middle,int count,int n)
{
          	UtilityFile ui=new UtilityFile();
                String str;
		System.out.println("Is your number: "+middle);
         	System.out.println("if it is your number then enter yes otherwise enter range i.e low or high as Input");
		str=ui.inputString();
                do
                  {
                     if(str.equals("yes"))
                       {
                           System.out.println("the number is: "+middle);
                           break;
                        }
                           else if(str.equals("high"))
                           {
                             lower=middle++;
                              count++;
                            }
                             else if(str.equals("low"))
                               {
                                   upper=middle--;
                                    count++;
                                 }
                         if(count<n)
                           {
                                 middle=(lower+upper)/2;
                                  System.out.println("Is your number: "+middle);
				System.out.println("If it is your number then enter yes otherwise enter range i.e low or high as Input");
				str=ui.inputString();
                             }
                         
                           }
                         while(lower<=upper);
                              
 }



}
























                
        







