import com.bridgelab.utilityFile.UtilityFile;
public class Stock
{
    public static void main(String[] args)
    {
      Stock s=new Stock();
      UtilityFile ui=new UtilityFile();
      System.out.println("enter the no of stocks u want to insert:");
      int no=ui.inputInteger();
      StockReport st[]=new StockReport[no];//creating object for StockReport class type is array
       System.out.println("enter the stock details:");
     
        for(int i=0;i<no;i++)
          {
         st[i]= new StockReport();//taking stock values
           }
        for(int i=0;i<st.length;i++)
         {
           st[i].displayStock();
          }
     }
}
            

       
      

