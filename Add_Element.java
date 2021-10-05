import java.util.Scanner;
class Add_Element 
{
public static void main(String [] args)
{
int arr[]=new int[5];
int pos=3;
Scanner sc=new Scanner(System.in);
for(int i=0;i<5;i++)
{
arr[i]=sc.nextInt();
}
for(int i=0;i<5;i++)
{
System.out.println(arr[i]);
}
int arr1[]=new int[6];
for(int i=0;i<6;i++)
{
if(i<pos-1)
{
arr1[i]=arr[i];
}
else if(i==pos-1)
{
arr1[i]=67;
}
else if(i>pos-1)
{
arr1[i]=arr[i-1];
}
else
{
}
}
for(int i=0;i<6;i++)
{
System.out.println(arr1[i]);
}
}}