class Eucledian
{
public static void main(String [] args)
{
int m=60;
int n=24;
int r=gcd(m,n);
System.out.println(r);
}
public static int  gcd(int m,int n)
{
if(n==0)
{
return m;
}
else {
while(n!=0)
{
int r=m%n;
m=n;
n=r;

}
return m;
}
}
}

