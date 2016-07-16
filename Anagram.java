import com.bridgelab.utility.UtilityFile;
import java.io.BufferedReader;
import java.io.InputStreamReader;
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
		//System.out.println(str1);
		//System.out.println(str2);
		a.isCheck(str1,str2);

	}

public void isCheck(String str1,String str2)
{
	String str3=str1.replaceAll("\\s+"," ");
	String str4=str2.replaceAll("\\s+"," ");
	char[] abc=str3.toCharArray();
        char[] xyz=str4.toCharArray();
	int count1=0;
	int count2=0;
	if(str3.length()!=str4.length())
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





