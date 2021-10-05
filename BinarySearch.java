import java.util.Scanner;
import java.util.Arrays;
class BinarySearch
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
Arrays.sort(a);
int key=sc.nextInt();
boolean b=binary(a,0,key,n-1);
if(b)
{
System.out.println(b);
}
}
static boolean binary(int a[],int l,int key,int h)
{
int mid=(l+h)/2;
if(a[mid]==key)
{
return true;
}
else
{
if(l<h)
{
if(key<a[mid])
{
return binary(a,0,key,mid-1);
}
else if(key>a[mid])
{
return binary(a,mid+1,key,h);
}
return false;
}
else
{
return false;
}
}
}
}


