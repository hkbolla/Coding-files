import java.util.Scanner;
class Circular
{
static int front,rear;
static Scanner sc=new Scanner(System.in);
static int a[]=new int[5];
public static void main(String [] args)
{
 int choice;
front =-1;
rear=-1;
do
{
System.out.println("1.enque\n 2.dequeue \n 3.display");
choice=sc.nextInt();
switch(choice)
{
case 1:
System.out.println("Enter the value to enqueue");
int x=sc.nextInt();
enqueue(x);
break;
case 2:
System.out.println();
dequeue();
break;
case 3:
display();
break;
case 4:
break;

}

}
while(choice!=4);
}
static void enqueue(int x)
{
if(front==-1)
{
front=rear=0;

a[rear]=x;
}
else if((rear+1)%5==front)

{
System.out.println("Overflow");
}
else
{
rear=(rear+1)%5;
a[rear]=x;

}
}
static void dequeue()
{
if(front==-1)
{
System.out.println("unerflow");
}
else
{
System.out.println(a[front]);

front=(front+1)%5;
}

}
static void display()
{
if(front==-1)
{
System.out.pri
3



































































































ntln("Empty");
}
else
{
for(int i=rear;i>(rear+1)%5;i--)
{
System.out.println(a[i]);
}
}
}
}



