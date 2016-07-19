package com.bridgelab.utilityFile;
import com.bridgelab.utilityFile.UtilityFile;
class FlipCoin{
	public static void main(String[] args){
		UtilityFile u=new UtilityFile();
		FlipCoin f=new FlipCoin();//to create an object for class
		System.out.println("Enter no of times to flipCoin");
		int number=u.inputInteger();
		f.flipCoin(number);//function call	
	}

	public void flipCoin(int number){
		double noOfHeads=0,noOfTails=0,noOfTosses=number;
		for(int i=1;i<=number;i++){	
		double random=Math.random();//the random function generates random numbers
		System.out.println(random);
		if(random<0.5)//0 to 1 
		noOfTails++;
		else
		noOfHeads++;
		}
		System.out.println("Tails"+noOfTails+"\nHeads"+noOfHeads);
		System.out.println("Percentage Of Tails"+(noOfTails/noOfTosses)*100);
		System.out.println("Percentage Of Heads"+(noOfHeads/noOfTosses)*100);
	}

}

