import java.util.Scanner;
class CyclicRotation 
{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int k=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
for(int i=0;i<k;i++)
{
rotate(a,n);
}
for(int i=0;i<n;i++)
{
System.out.println(a[i]);

}}
public static void rotate(int a[],int n)
{
int x=a[n-1];

int i;
for(i=n-1;i>0;i--)
{
a[i]=a[i-1];

}
a[0]=x;
}
}
