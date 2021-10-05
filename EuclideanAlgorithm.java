import java.util.Scanner;
class EuclideanAlgorithm
{
 static int  gcd(int a,int b)
{
if(a==0)
{
return b;
}
return gcd(b%a,a);
}
 static int extendedgcd(int a1,int m)
{
for(int i=0;i<m;i++)
{
if(((a1%m)*(i%m))%m==1)
{
return i;
}

}
return 1;
}

public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number1");
int a=sc.nextInt();
System.out.println("Enter the number2");
int b=sc.nextInt();
int result=gcd(a,b);
System.out.println("The gcd of entered numbers:"+result);
System.out.println("Enter the value of a1");
int a1=sc.nextInt();
System.out.println("Enter the m value");
int m=sc.nextInt();
int result1=extendedgcd(a1,m);
System.out.println("The multiplicative inverse of modulo:"+result1);


}
}