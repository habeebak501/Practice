package com.bridgelab.utilityFile;
import com.bridgelab.utilityFile.UtilityFile;
import java.util.Scanner;
public class ArrayList
{
       public static void main(String[] args)
       {
          char ch;
        ArrayList a1=new ArrayList();//to create an object for class
        UtilityFile ui=new UtilityFile();
         Scanner sc=new Scanner(System.in);
do
{
        System.out.println("enter the which type of data u want to strore:");
        System.out.println("1:enter the number you want integer type of values");
        System.out.println("2:enter the number you want double type of values");
        System.out.println("3:enter the number you want boolean type of values:");
        int c=ui.inputInteger();
       

  
      switch(c)
        {
         case 1:
                         
                     System.out.println("enter the number how many rows you want:");
                            int m=ui.inputInteger();
                     System.out.println("enter the number how many columns you want:");
                            int n=ui.inputInteger();
                            int array[][]=new int[m][n];//allocating memory for array
                     System.out.println("enter the values in 2D array:");
                     for(int i=0;i<m;i++)
                       {
                                 for(int j=0;j<n;j++)
                                  {
                                    
                              array[i][j]=ui.inputInteger();
                                    }
                        }
                      System.out.println("...............................");
                     System.out.println("the elements are:");
                      for(int i=0;i<m;i++)
                          {
                              for(int j=0;j<n;j++)
                               {
                             System.out.print(array[i][j]+"\t");
                               }
                              System.out.println("\n");
                         }
             break;
                
           case 2:
                            
                      System.out.println("enter the number how many rows you want:");
                            int m1=ui.inputInteger();
                     System.out.println("enter the number how many columns you want:");
                            int n1=ui.inputInteger();
                            double array1[][]=new double[m1][n1];//allocating memory for array
                     System.out.println("enter the values in 2D array:");
                     for(int i=0;i<m1;i++)
                       {
                                 for(int j=0;j<n1;j++)
                                  {
                                    
                              array1[i][j]=ui.inputDouble();
                                    }
                        }
                      System.out.println("...............................");
                     System.out.println("the elements are:");
                      for(int i=0;i<m1;i++)
                          {
                              for(int j=0;j<n1;j++)
                               {
                             //System.out.println("array1[i][j]= "+array1[i][j]+"\t");
                             System.out.print(array1[i][j]+"\t");
                               }
                              System.out.println("\n");
                         }
            
              
                 // System.out.println("please enter the correct key word:");
 break;


               case 3:
                System.out.println("enter the how many rows u want:");
                 int m2=ui.inputInteger();
                 System.out.println("enter the how many columns u want:");
                 int n2=ui.inputInteger();
                 boolean array2[][]=new boolean[m2][n2];
                 System.out.println("enter the boolean values:");
                   for(int i=0;i<array2.length;i++)
                      {
                       for(int j=0;j<array2.length;j++)
                         {
                        //  java.util.Arrays.fill(array2[i][j],true );
                           //java.util.Arrays.fill(array2[j],false);
                           array2[i][j]= true;
                          }
                       }
                
                     System.out.println("...................................");
                       System.out.println("the boolean values are:");
                   for(int i=0;i<m2;i++)
                    {
                      for(int j=0;j<n2;j++)
                        {
                            System.out.println(array2[i][j]+"\t");
                         }
                       System.out.println("\n");
                    }
            break;
                      default:
                       System.out.println("please try again");
               }
               
               System.out.println("do you want to continue:(Y/N)");
                    //  ch=ui.inputString();
                     ch = sc.next().charAt(0);
              
            }while(ch == 'y'|| ch == 'Y');


 }
}


               
                   
