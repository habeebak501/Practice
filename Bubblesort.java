package com.bridgelab.utilityFile;
import com.bridgelab.utilityFile.UtilityFile;
import java.util.Scanner;
public class Bubblesort
{
	public static void main(String[] args)
	 {
                          char ch=' ';

                       Scanner sc=new Scanner(System.in);
                      UtilityFile ui3=new UtilityFile();
                  do
                  {
                      System.out.println("enter one number:");
                      System.out.println("press 1 numbers sorting:");
                      System.out.println("press 2 string sorting:");
                      System.out.print("enter your choice:");
                      int num=ui3.inputInteger();
          
                  switch(num)
                  {
                         case 1:
               
	      
		System.out.println("enter the size u want to insert:");
		int n=ui3.inputInteger();
		int array[]=new int[n];
		System.out.println("enter the numbers:");
		for(int i=0;i<n;i++)
  		{
    			System.out.print("array["+i+"]:");
    			array[i]=ui3.inputInteger();
    		}
   			System.out.println("the elements are:");
   			for(int i=0;i<n;i++)
   			{
     				System.out.println("array["+i+"]= "+array[i]);
   			}
               		 for(int i=0;i<n;i++)
                 	{
                  	 for(int j=0;j<n-i-1;j++)
                   	 {
                        	if(array[j]>array[j+1])
                         	 {
                      		 int temp=array[j];
                           	array[j]=array[j+1];
                           	 array[j+1]=temp;
                     	}
                    	}
                	 }
                  	System.out.println("the sorted elements are:");
                   	for(int i=0;i<n;i++)
                    	{
                         System.out.println("array["+i+"]= "+array[i]);
                    	 }
                 

                      break;
             	case 2:

		//UtilityFile ui1 =new UtilityFile();
		System.out.println("enter the size u want to insert strings:");
		int n1=ui3.inputInteger();
		System.out.println("enter the strings:");
		String array1[]=new String[n1];
		for(int i=0;i<n1;i++)
		{
                  System.out.print("array1["+i+"]: ");
                    array1[i]=ui3.inputString();
                 }
                  System.out.println("the strings are:");
                  for(int i=0;i<n1;i++)
                   {
                      System.out.println("array1["+i+"]= "+array1[i]);
                    }
                  String key;
                	for(int j=0;j<n1;j++)
                 	{
                   	for(int i=j+1;i<n1;i++)
                  	  {
                      	 if(array1[i].compareTo(array1[j])<0)
                      	 {
                         
                       
                           	 key=array1[j];
                           	 array1[j]=array1[i];
                                 array1[i]=key;
                     	 }
                   	 }
                    
                   	}
                    	System.out.println("the sorted strings are:");
                  	for(int i=0;i<n1;i++)
                   	{
                   	System.out.println("array1["+i+"]= "+array1[i]);
                  	 }
               break;
           	 default:
              	System.out.println("number is not found:");
                 }
            	System.out.println("do you want to continue:(Y/N)");
                    //  ch=ui.inputString();
                     ch = sc.next().charAt(0);
              
           	 }
         	while(ch == 'y'|| ch == 'Y');


            
                }

}

