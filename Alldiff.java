import java.util.Scanner;
class Alldiff
{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int d=sc.nextInt();
int sum=0;
int c=0;
for(int i=1;i<=n;i++)
{
while(i!=0)
{
int rem=i%10;
sum=sum+rem;
i=i/10;
}

int res=n-sum;
if(res>d)
{
c++;
}
}
System.out.println(c);

}
}