package com.bridgelab.utilityFile;
import com.bridgelab.utilityFile.UtilityFile;
import com.bridgelab.Node;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class LinkedList
{    
	 Node head,next;
 	public  void insert(String data)
	{
      		Node newNode;
      		newNode=new Node();
     
      		if(head==null)
      		{
        		newNode.data=data;
        		newNode.next=null;
          		head=newNode;
      		}
       		else
      		{
       			 newNode.data=data;
         		newNode.next=head;
            		head=newNode;
      		}
 
	}
public  void display()
{

     	Node temp=head;
    
       	while(temp!=null)
        {
        	System.out.print(temp.data +"-->");

          	temp=temp.next;
        }
    	System.out.println(" ");
}



public static void main(String[] args)throws Exception
{
  	LinkedList li=new LinkedList();
/*
          li.insert(10);
          li.insert(20);
          li.insert(30);
           li.display();
*/
       System.out.println(".....................................");
        

	BufferedReader br=new BufferedReader(new FileReader("link.txt"));
        String str=" ";
                try
                 {
		
                  	str=br.readLine();
                     	System.out.println("........................................");
                   	System.out.println("file to display words in string format:");
                  	System.out.println(str);
                  	System.out.println("........................................");
                 }
                catch(Exception e)
                {
                	System.out.println("the file is not found");
	    	 }
                                 
			 String str1[]=str.split(" ");
                    	System.out.println("the string format convert to array:");
                	for(int i=0;i<str1.length;i++)
                     	{
			System.out.println("str1["+i+"]= "+str1[i]);
                      	}
                      	System.out.println("........................................"); 
                          for(int i=0;i<str1.length;i++)
                          {
                                  li.insert(str1[i]);
                          }
                                  li.display();
            }

}








































  
