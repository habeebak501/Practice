package com.bridgelab.utilityFile;
import com.bridgelab.utilityFile.UtilityFile;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
public class Anagram
{
	public static void main(String[] args)throws Exception
	{
		UtilityFile ui=new UtilityFile();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Anagram a=new Anagram();
		System.out.println("enter the string:");
		String str1=br.readLine();
		System.out.println("enter the another string:");
		String str2=br.readLine();
		a.isCheck(str1,str2);//Function call

	}

public void isCheck(String str1,String str2)//to check two strings anagram or not
{
	String str3=str1.replaceAll("\\s+"," ");//to remove spaces
	String str4=str2.replaceAll("\\s+"," ");
	char[] abc=str3.toCharArray();//to convert string to characters
        char[] xyz=str4.toCharArray();
           	  System.out.println("................................");
           	 System.out.println("u entered string  1: "+str3);
           	 System.out.println("u entered string  2: "+str4);
        	 Arrays.sort(abc);
         	Arrays.sort(xyz);
        	String sorted = new String(abc);
        	String sorted1=new String(xyz);
         	System.out.println("...................................");
        	 System.out.println("sorted string one is : "+sorted);
         	System.out.println("sorted string two is : "+sorted1);
         
	if(str3.length()!=str4.length())
          {
                   
		System.out.println("the both strings are not anagram");
		
	   }
         else
           {
             if(sorted.equals(sorted1))
               {
              	System.out.println("the two strings are anagram");
	        }
		else
                {
                 System.out.println("the two strings are not anagram");
                }
          }
}
}
/*
	int count1=0;
	int count2=0;
	if(str3.length()!=str4.length())//to check the lengths of two strings
 	{
		System.out.println("the both strings are not anagram");
	}
	else
	{
		for(int i=0;i<abc.length;i++)
		{
			count1=count1+abc[i];
			count2=count2+xyz[i];
		}
	if(count1==count2)
	{
 		System.out.println("the two strings are anagram");
	}
        else
	{
		System.out.println("the two strings are not anagram");
	}
        }
}
}


*/


