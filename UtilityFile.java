package com.bridgelab.utilityFile;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UtilityFile
{
  BufferedReader br,br2;
          public UtilityFile()
          {
            br=new BufferedReader(new InputStreamReader(System.in));
           }
         //reading input string
         public String inputString()
         {
           try
             {   
              return br.readLine();
             }
            catch(Exception e)
            {
              System.out.println(e);
             }
           return "";
          }
        //reading integer input
         public int inputInteger()
         {
           try
           {
             try
              {
               return Integer.parseInt(br.readLine());
              }
              catch(NumberFormatException e)
              {
                System.out.println(e);
               }
              }
              catch(Exception e)
              {
                System.out.println(e);
              }
             return 0;
              }
        //reading double input
        public double inputDouble()
        {
          try
            {
             try
              {
               return Double.parseDouble(br.readLine());   
               }
               catch(NumberFormatException e)
               {
                System.out.println(e);
               }
            }
              catch(Exception e)
             {
                System.out.println(e);
                }
              return 0.0;
         }
         //readingthe array values
       public int[] input1DArray(int arraySize)
       {
         int array[]=new int[arraySize];
         for(int i=0;i<arraySize;i++)
         {
           System.out.println("enter the array["+i+"]:");
           array[i]=inputInteger();
          }
        return array;
         }

      //print the array values
     public void print2DArray(int array[])
     {
       for(int i=0;i<array.length;i++)
       {
         System.out.print(array[i]+ " ");
         System.out.println();
        }
       }
      
    //Reading boolean value
	public boolean inputBoolean()
         {
		try
                  {
			return Boolean.parseBoolean(br.readLine());	
		}
		catch(Exception e)
                {
			System.out.println(e);
		}
		return false;
	}


     //Reading a string from file
     public String getFileText(String fileName)
       {
		try
                   {
			 br2 = new BufferedReader(new FileReader(fileName));
			StringBuilder sb=new StringBuilder();
			String line = br2.readLine();
			while(line!=null){
				sb.append(line);
				sb.append(System.lineSeparator());
				line = br2.readLine();		
			}
			return sb.toString();
		 }
		catch(Exception exception)
                 {
			return null;
		}
	}	


}
                     

