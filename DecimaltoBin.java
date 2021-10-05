import java.util.Scanner;
class DecimaltoBin
{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
int m=sc.nextInt();
dectobin(m);
}
static void dectobin(int m)
{
int a[]=new int[1000];
int i=0;
while(m>0)
{
a[i]=m%2;
m=m/2;
i++;
}
for(int j=i-1;j>=0;j--)
{
System.out.print(a[j]);
}
}}

