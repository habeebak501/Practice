import com.bridgelab.utilityFile.UtilityFile;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class SearchWord
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String wordList=new String();
		UtilityFile ui=new UtilityFile();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the words seperated comma(,):");
	      	wordList=br.readLine();
                System.out.println("..............................");
		System.out.println(wordList);
                      int count=0;
                     String[] word=new String[20];
                 for(String str1 : wordList.split(","))
                    {
                 word[count++]=str1;
                  }
               word=wordSearch(word,count);
               System.out.println("..............................");
               for(int i=0;i<count;i++)
                 System.out.print(word[i]+ " ");
                  System.out.println(" ");              
                System.out.println(".............................");
                int lower=0;
                 int upper=0;
                int middle=(lower+upper)/2;
                  int range=word.length;
                  System.out.println("enter the one string to search for wordlist:");
                   String word1=br.readLine();
                    System.out.println("u are enter the search string is: \n"+word1);
                 binarySearch(word,word1);

           }
 public static String[] wordSearch(String[] word1,int count)
  {
    
    for(int i=0;i<count;i++)
      {
      
      for(int j=0;j<count && j!=i;j++)
        {
        int check=word1[i].compareTo(word1[j]);
    
        if(check<0) 
         {
          String str1=word1[i];
          word1[i]=word1[j];
          word1[j]=str1;
      }
    }
  }
  return word1;
}
public static String[] binarySearch(String[] word,String word1)
{
   int lower=0;
   int upper=0;
   int middle=(lower+upper)/2;
    int check=word1.compareTo(word[middle]);
         if(check==0)
         {
          System.out.println("the word is found" +middle);
		break;
          }
           else if(check>0)
             {
               lower=middle+1;
               binarySearch(word,word1);
              }
             else
              {
                  upper=middle-1;
                   binarySearch(word,word1);
              }
}


}
