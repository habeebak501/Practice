package com.bridgelab.utilityFile;
import com.bridgelab.utilityFile.UtilityFile;
import java.util.Scanner;
public class Harmonic
	{
	public static void main(String[] args)
	{
	UtilityFile ui=new UtilityFile();
	int n;
	double result=0.0;
	System.out.println("enter the n value:");
	n=ui.inputInteger();
	while(n>0)
	{
   	result=result+(double)1/n;
	//System.out.println("the harmonic value is"+result);
	n--;
	}
	System.out.println("the nth value of harmonic value is "+result);

	}
}


