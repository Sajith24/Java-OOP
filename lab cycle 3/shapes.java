import java.util.Scanner;
public class shapes{
public double rect(double length, double width)
{
return length*width;
}
public double circle(double radius)
{
return 3.14*radius*radius;
}
public double square(double side)
{
return side*side;
}
public static void main(String args[])
{
shapes area=new shapes();
Scanner scanner=new Scanner(System.in);
System.out.println("enter the length:");
double rectlength=scanner.nextDouble();
System.out.println("enter the width:");
double rectwidth=scanner.nextDouble();
double rectarea=area.rect(rectlength,rectwidth);
System.out.println("area of rectangle:" +rectarea);

System.out.println("enter the radius:");
double circleradius=scanner.nextDouble();
double circlearea=area.circle(circleradius);
System.out.println("area of circle:" + circlearea);

System.out.println("enter the side:");
double squareside=scanner.nextDouble();
double squarearea=area.square(squareside);
System.out.println("area of square:" + squarearea);
}
}
