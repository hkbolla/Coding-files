import java.util.Scanner;
class EvenOrODD
{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");

int a=sc.nextInt();
if(a%2==0)
{
System.out.println("the number even");
}
else
{
System.out.println("the number is odd");
}
}
}
