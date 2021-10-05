import java.util.Scanner;
class Node
{
Node prev,next;
int data;
}
public class DoubleLinkedList
{
public static void main(String [] args)
{
Dll d=new Dll();
d.create();
d.insertatbegin();
d.insertatend();
d.insertatpos();
d.deleteatbegin();
d.deleteatend();
d.deleteatpos();
//d.reverse();
d.display();
}
}
class Dll
{
static Node head=null,tail=null;
static Scanner sc=new Scanner(System.in);
static void create()
{
System.out.println("Enter the nodes");
int n=sc.nextInt();
System.out.println("Enter the data");
Node temp;
for(int i=0;i<n;i++)
{
temp=new Node();
temp.data=sc.nextInt();
temp.next=null;
temp.prev=null;
if(head==null){
head=tail=temp;
}
else
{

tail.next=temp;
temp.prev=tail;
tail=temp;
}
}
}

static void display()
{
Node temp=tail;
if(head==null)
{
System.out.println("List is empty");
}
else
{
while(temp!=null)
{
System.out.print(temp.data+ " ");
temp=temp.prev;
}
}
}
static void insertatbegin()
{
Node temp=new Node();
System.out.println("Enter the data to insert at begin");
temp.data=sc.nextInt();
temp.next=head;
temp.prev=null;
head=temp;
}
static void insertatend()
{
Node temp=new Node();
System.out.println("Enter the data");
temp.data=sc.nextInt();
tail.next=temp;
temp.prev=tail;
tail=temp;
}
static void insertatpos()
{
int count=1;
Node c=head;
System.out.println("Enter the pos value");
int pos=sc.nextInt();

while(c.next!=null)
{
if(count==pos-1)
{
break;
}
count++;
c=c.next;
}
if(c!=null)
{
Node temp=new Node();
System.out.println("Enter the data to inseted");
temp.data=sc.nextInt();
temp.next=c.next;
c.next.prev=temp;
c.next=temp;
temp.prev=c;
c.next=temp;
}
}
static void deleteatbegin()
{
head=head.next;
head.prev=null;
}
static void deleteatend()
{
tail=tail.prev;
tail.next=null;}
static void deleteatpos()
{
System.out.println("enter the pos value");
int pos=sc.nextInt();

int count=1;
Node c=head;

while(c.next!=null)
{
if(count==pos-1)
{
break;
}
count++;

c=c.next;
}
c.next.next.prev=c;
c.next=c.next.next;

}
/*
static void reverse()
{
Node temp=tail;
while(temp!=null)
{
System.out.print(temp.data+" ");
temp=temp.prev;
}
}
*/
}




