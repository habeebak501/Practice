package com.bridgelab.utilityFile;
import com.bridgelab.utilityFile.UtilityFile;
public class StockReport
{
	//public static void main(String[] args)
	//{
		UtilityFile ui=new UtilityFile();
		String sharename;
		int noofshares;
		double shareprice,totalnum;
		public StockReport()
		{
                        System.out.println(".............................");
			System.out.println("enter the stock name:");
                	sharename=ui.inputString();
			System.out.println("enter the no of shares:");
			noofshares=ui.inputInteger();
			System.out.println("enter the share price:");
			shareprice=ui.inputDouble();
                        totalnum=noofshares*shareprice;
		}
public void displayStock()
{
	System.out.println("...........stock report...............");
        System.out.println("share name  : "+sharename);
        System.out.println("shareprice  : "+shareprice);
        System.out.println("share total : "+totalnum);
	
}
public void stock()
{
    	System.out.println("enter the file");
	String abc=ui.inputString();
	String stoc = ui.getFileText(abc);
       // System.out.println(stoc);
}
}

        
