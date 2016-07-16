/*import com.bridgelab.utility.Utility;
import java.util.Scanner;
public class FlipCoin
{
public static void main(String[] args)
{
Utility ui=new Utility();
FlipCoin f=new FlipCoin();
System.out.println("how many time u want to flip the coin:");
int coins=ui.inputInteger();
f.tossCoin(coins);
}
public void tossCoin(int coins)
{
//double random=Math.random();
double tail=0,head=0;
for(int i=1;i<=coins;i++)
{
double random=Math.random();
if(random<0.5)
{
head++;
}
else
{
tail++;
}
}
System.out.println("tails: "+tail);
System.out.println("heads: "+head);
System.out.println("no of tails percentage: "+(tail/coins)*100);
System.out.println("no of heads percentage: "+(head/coins)*100);
}
}
*/
import com.bridgelab.utility.UtilityFile;
class FlipCoin{
	public static void main(String[] args){
		Utility u=new Utility();
		FlipCoin f=new FlipCoin();
		System.out.println("Enter no of times to flipCoin");
		int number=u.inputInteger();
		f.flipCoin(number);	
	}

	public void flipCoin(int number){
		double noOfHeads=0,noOfTails=0,noOfTosses=number;
		for(int i=1;i<=number;i++){	
		double random=Math.random();
		System.out.println(random);
		if(random<0.5)
		noOfTails++;
		else
		noOfHeads++;
		}
		System.out.println("Tails"+noOfTails+"\nHeads"+noOfHeads);
		System.out.println("Percentage Of Tails"+(noOfTails/noOfTosses)*100);
		System.out.println("Percentage Of Heads"+(noOfHeads/noOfTosses)*100);
	}

}

