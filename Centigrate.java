import java.util.Scanner;
class Centigrate
{
public static void main(String [] args)
{
System.out.println("enter the number ");
Scanner sc=new Scanner(System.in);
int f=sc.nextInt();
int c=(5/9)*(f-32);
System.out.println("The temperature in the centigrsde is:" +c);
}
} 
