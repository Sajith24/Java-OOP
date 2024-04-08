import java.util.Arrays;
import java.util.Scanner;

public class sortchar
{
public static void main(String args[])
{
Scanner scanner=new Scanner(System.in);
System.out.println("enter the string:");
String str=scanner.nextLine();
str=str.toLowerCase();
char[] chars=str.toCharArray();
Arrays.sort(chars);
String sorted=new String(chars);
System.out.println("\n sorted characters of the string:"+sorted);
scanner.close();
}
}
