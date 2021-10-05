import java.util.Scanner;
class AlternateArray
{
public static void main(String [] args)
{
int arr1[]={1,2,3,4};
int arr2[]={5,6,7};
int r=arr1.length+arr2.length;
int arr3[]=new int[r];
for(int i=0;i<arr1.length;i=i+2)
{

arr3[i]=arr1[i];
}
for(int j=1;j<arr2.length;j=j+1)
{
arr3[j]=arr2[j];
}
for(int i=0;i<r;i++)
{
System.out.println(arr3[i]);
}

}
}
