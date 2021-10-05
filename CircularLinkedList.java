import java.util.Scanner;

public class CircularLinkedList
{
public static void main(String [] args)
{
Cll c=new Cll();
c.create();
c.display();
}
}
class Node
{
int data;
Node prev;
Node next;
}
class Cll
{
static Node head=null,tail=null;
static Scanner sc=new Scanner(System.in);
static void create()
{
System.out.println("Enter the size of linked List");
int n=sc.nextInt();
Node temp;
for(int i=0;i<n;i++)
{
temp=new Node();
temp.data=sc.nextInt();
temp.next=null;
temp.prev=null;
if(head==null)
{
head=tail=temp;
head.next=head;
head.prev=head;
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
Node temp=head;
if(head==null)
{
System.out.println("List is Empty!");
}
else
{
while(temp.next!=head)
{
System.out.print(temp.data+ " ");
temp=temp.next;
}
}
}}