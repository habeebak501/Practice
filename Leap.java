package com.bridgelab.utilityFile;
import com.bridgelab.utilityFile.UtilityFile;
public class Leap
{
	public static void main(String[] args)
	{
    	UtilityFile ul=new UtilityFile();
    	int year,count=0;
    	System.out.println("enter the year:");
    	year=ul.inputInteger();
	int temp=year;
   	do
    	{
    	 temp=temp/10;
     	count++;
    	}
     	while(temp>0);
       	{
       	    if(count==4)
             {
               if(year%4==0||year%400==0&&year%100!=0)//to check leap year or not
                 {
                     System.out.println("year: "+year+" is leap year");
                  }
     
              else
              {
    
      System.out.println("year "+year+" is not a leap year");
              }
    
     	}
 	else
	{
	System.out.println("please enter the 4 digit number");
	}
	}
	}
}





