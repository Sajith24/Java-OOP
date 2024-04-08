import java.util.Arrays;
import java.util.Scanner;

public class sortstring
{
public static void main(String args[])
{
Scanner scanner=new Scanner(System.in);
System.out.println("enter the num of strings:");
int n = scanner.nextInt();
scanner.nextLine();
String[] strings=new String[n];
for(int i=0;i<n;i++)
{
System.out.println("enter string" +(i+1) + ":");
strings[i]=scanner.nextLine();
}
Arrays.sort(strings);
System.out.println("sorted string:");
for(String str:strings){
System.out.println(str);
}
}}
