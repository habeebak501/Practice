import com.bridgelab.utility.UtilityFile;
import java.util.Scanner;
public class Power
{
public static void main(String[] args)
{
UtilityFile ui=new UtilityFile();
int result=1,j=2;
System.out.println("enter the n value:");
int n=ui.inputInteger();

for(int i=0;i<n;i++)
{
result=result*j;
}
System.out.println("the 2^n value is "+result);
}
}
