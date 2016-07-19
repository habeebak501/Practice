package com.bridgelab.utilityFile;
import com.bridgelab.utilityFile.UtilityFile;          
public class StopWatch
{
	UtilityFile ui=new UtilityFile();
	public long starttime=0;
	public long endtime=0;
	public long elapsedtime=0;
	public void start()
	{
          starttime=System.currentTimeMillis();
          System.out.println("the starting time is : "+starttime);
         }
        public void stop()
        {
          endtime=System.currentTimeMillis();
         System.out.println("the ending time is : "+endtime);
         }
        public void elapsed()
         {
              elapsedtime= endtime-starttime;
                 long sec=elapsedtime/1000;
                  //long sec=(long)(elapsedtime/1000);
                 System.out.println("the elapsed seconds time is: "+sec);
                System.out.println("the elapsed milliseconds time is: "+elapsedtime);
           //   return elapsedtime;
          }

public static void main(String[] args)
{
   UtilityFile ui=new UtilityFile();
    StopWatch sw=new StopWatch();
    
        System.out.println("enter one number the timer will be start:");
         int a=ui.inputInteger();
        sw.start();
         System.out.println("enter two number the the timer will be stop:");
          int b=ui.inputInteger();
        
         sw.stop();
          
          sw.elapsed();
}
}
    
 






