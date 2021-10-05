import java.util.Scanner;
class Delete
{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();

int arr[]=new int[n];
int arr1[]=new int [n-1];
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
int r=sc.nextInt();
for(int i=0,j=0;i<n;i++)
{

if(arr==null || r<0 || r>n)
{
System.out.println(arr[i]);
}
if(i==r)
{
continue;
}
arr1[j++]=arr[i];
}

for(int i=0;i<n-1;i++)
{
System.out.println(arr1[i]);
}
}
}