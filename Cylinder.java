import java.util.Scanner;
import java.util.Stack;
class Cylinder
{
static int top1,top2,top3;

public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
int n1=sc.nextInt();
int n2=sc.nextInt();
int n3=sc.nextInt();
int a1[]=new int[n1];
int a2[]=new int[n2];
int a3[]=new int[n3];
for(int i=0;i<n1;i++)
{
a1[i]=sc.nextInt();
}
for(int i=0;i<n2;i++)
{
a2[i]=sc.nextInt();
}
for(int i=0;i<n3;i++)
{
a3[i]=sc.nextInt();
}
System.out.println(equalstack(a1,a2,a3));
}
static int  equalstack(int a1[],int a2[],int a3[])
{
Stack<Integer> s1=new Stack<Integer>();
Stack<Integer> s2=new Stack<Integer>();
Stack<Integer> s3=new Stack<Integer>();
int h1=0,h2=0,h3=0;
for(int i=a1.length-1;i>=0;i--)
{
 h1=a1[i];
s1.push(h1);
}
for(int i=a2.length-1;i>=0;i--)
{
 h2=a2[i];
s2.push(h2);
}
for(int i=a3.length-1;i>=0;i--)
{
 h3=a3[i];
s3.push(h3);
}
while(true)
{
if(s1.isEmpty() || s2.isEmpty() ||s3.isEmpty())
{
return 0; 
}

h1=s1.peek();
h2=s2.peek();
h3=s3.peek();
if(h1==h2 && h2==h3)
{
return h1;

}
else 
{
if(h1>h2 && h2>h3)
{
s1.pop();
}
else if(h2>h1 && h1>h3)
{
s2.pop();
}
else
{
s3.pop();
}
}
}
}
}

