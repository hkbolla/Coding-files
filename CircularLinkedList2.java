import java.util.Scanner;
class CircularLinkedList2av
{
public static void main(String [] args)
{
Cll c=new Cll();

c.create();
c.insertatbegin();
c.insertatend();
c.insertatpos();

c.display();
}
}
class Node 
{
Node prev;
int data;
Node next;
}
class Cll
{
static Scanner sc=new Scanner(System.in);
static Node head=null,tail=null;
static void create()
{
Node temp=null;
System.out.println("Enter the Size of the list");
int n=sc.nextInt();
for(int i=0;i<n;i++)
{
temp= new Node();
temp.data=sc.nextInt();
temp.next=null;
temp.prev=null;
if(head==null)
{
head=tail=temp;
temp.next=head;
temp.prev=head;
}
else
{
tail.next=temp;
temp.prev=tail;
tail=temp;
tail.next=head;
head.prev=tail;
}
}
}
static void display()
{

if(head==null)
{
System.out.println("List is empty");
}
else
{
Node temp=null;
temp=head;

while(temp.next!=head)
{
System.out.print(temp.data+ " ");
temp=temp.next;
}
System.out.println(temp.data);
}
}
static void insertatbegin()
{
Node temp=new Node();
temp.data=sc.nextInt();
temp.next=head;

head.prev=temp;
head=temp;
head.prev=tail;
tail.next=head;
}
static void insertatend()
{
Node temp=new Node();
temp.data=sc.nextInt();
tail.next=temp;
temp.prev=tail;
tail=temp;
temp.next=head;
head.prev=tail;

}
static void insertatpos()
{
Node c=head;
System.out.println("Enter the pos position");
int pos=sc.nextInt();
int count=1;
Node temp=new Node();
temp.data=sc.nextInt();
while(c.next!=head)
{
if(count==pos-1)
{
break;
}

c=c.next;
count++;
}
if(c.next!=head)
{
c.next=temp;
temp.prev=c;
temp.next=c.next;
c.next.prev=temp;
}
else
{
temp.next=c.next;
c.next.prev=temp;
c.next=temp;
temp.prev=c;

}
}

}




