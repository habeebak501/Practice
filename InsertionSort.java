package com.bridgelab.utilityFile;
import com.bridgelab.utilityFile.UtilityFile;
import java.util.Arrays;
public class InsertionSort
{
	 public static void sort(String[] word,int n)
          {
             	 String key;
            	 for (int j = 1; j < n; j++) 
                 { 
   		 key = word[j];
    		int i = j - 1;
    		while (i >= 0) 
                {
      		if (key.compareTo(word[i]) > 0)
                {
        	break;
      		}
     		 word[i + 1] = word[i];
      			i--;
   		 }
   		 word[i + 1] = key;
                      
                
        
}
 
}
public static void main(String[] args)
{
	UtilityFile ui=new UtilityFile();
	System.out.println("enter the how much words u want to insert:");
	int n=ui.inputInteger();
	String[] word=new String[n];
	System.out.println("enter the words:");
	for(int i=0;i<n;i++)
	{
		System.out.print("word["+i+"]: ");
		word[i]=ui.inputString();
	}
                  System.out.println("................................");
		System.out.println("the elements are:");
		for(int i=0;i<n;i++)
		{
			System.out.println("word["+i+"]= "+word[i]);
		}
                     System.out.println("................................");
			sort(word,n);
                         System.out.println("the sorted elements are:");
           		for(int i=0;i<n;i++)
             		System.out.println("word["+i+"] = " + word[i]);

}
}
