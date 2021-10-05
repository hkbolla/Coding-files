import java.util.Scanner;
class ArrayInsertion
{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);

int n=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n-1;i++)
{
arr[i]=sc.nextInt();
}
int x=14;
int j=3;
insert(arr,x,j,n);
for(int i=0;i<n;i++)
{
System.out.print(arr[i]);
}
}
static void insert(int arr[],int x,int j,int n)
{
for(int i=n-1;i>j-1;i--)
{
arr[i]=arr[i-1];
}
arr[j-1]=x;
}
}
