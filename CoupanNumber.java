import com.bridgelab.utility.UtilityFile;
import java.util.Random;
public class CoupanNumber
{
           public static void main(String[] args)
            {
               UtilityFile ui=new UtilityFile();
               CoupanNumber c=new CoupanNumber();
               System.out.println("enter the number how many coupans you want:");
               int number=ui.inputInteger();
               c.randomNumber(number);
             }


             public  void randomNumber(int number)
             { 
                   double rann=0.0;
                  //Random r=new Random();
                  Random r=new  Random();
                  for(int i=0;i<number;i++)
                  {
                      // rann=Math.random();
                     //rann=r.inputDouble();
                     rann=r.nextInt(50);
                     System.out.println("the coupans are: "+rann);
                   }
             }


}
    


