import java.util.Scanner;
class Bubble2
{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
bubble(a,n);
for(int i=0;i<n;i++)
{
System.out.print(a[i]+ " ");
}
}
public static void bubble(int a[],int n)
{
for(int i=0;i<n-1;i++)
{
for(int j=i+1;j<n;j++)
{
if(a[i]>a[j])
{
int temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
}
}