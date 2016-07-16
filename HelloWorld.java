import java.util.Scanner;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class HelloWorld
{
public static void main(String[] args)throws Exception
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String name;
System.out.println("enter the string:");
name=br.readLine();
System.out.println("hello " +name+ " how are you?");
}
}

