import java.util.Scanner;
public class search{
public static void main(String args[])
{
Scanner scanner=new Scanner(System.in);
System.out.println("enter the number of elements:");
int n=scanner.nextInt();
int[] arr=new int[n];
int flag=0;
System.out.println("enter the element:");
for(int i=0;i<n;i++)
{
arr[i]=scanner.nextInt();
}
System.out.println("enter the elemnt to be searched:");
int e=scanner.nextInt();
for (int i=0;i<n;i++){
if(arr[i]==e){
flag++;
break;
}}
if(flag!=0){
System.out.println(e + "is found");
}
else{
System.out.println(e + "is not found");
}

}
}
