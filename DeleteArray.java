import java.util.Scanner;
class DeleteArray
{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[] =new int[n];
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
int j=2;

delete(arr,j,n);
for(int i=0;i<n;i++)
{
System.out.print(arr[i]);
}

}
static void delete(int arr[],int j,int n)
{
for(int i=j-1;i<n-1;i++)
{
arr[i]=arr[i+1];
}
arr[n-1]=0;
}
}