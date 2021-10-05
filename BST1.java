import java.util.Scanner;
class BST1
{
static Node root=null;
static Scanner sc=new Scanner(System.in);
static int choice;

public static void main(String [] args)
{
do
{
System.out.println("1.inser \n 2.delete \n 3.exit");
choice=sc.nextInt();
switch(choice)
{
case 1:
System.out.println("enter the values");
int x=sc.nextInt();
root=insert(root,x);
inorder(root);
break;
case 2:
int y=sc.nextInt();
root=delete(root,y);
preorder(root);
break;
case 3:
break;
}
}
while(choice!=3);
}

static Node insert(Node root,int x)
{
if(root==null)
{
root=new Node();
root.data=x;
root.left=root.right=null;
return root;
}
else if(root.data<x)
{
root.left=insert(root.left,x);
}
else 
{
root.right=insert(root.right,x);
}
return root;
}
static Node delete(Node root,int y)
{
if(root==null)
{
return null;
}
else if(root.data<y)
{
root.left=delete(root.left,y);
}
else if(root.data>y)
{
root.right=delete(root.right,y);
}
else
{
if(root.left==null)
{
return root.right;
}
else if (root.right==null)
{
return root.left;
}
else
{
root.data=min(root.left);
root.left=delete(root.left,root.data);
}
}
return root;
}
static int min(Node root)
{
if(root!=null)
{
while(root.left!=null)
{
root=root.left;
}
}
return root.data;
}
static void inorder(Node root)
{
if(root!=null)
{
inorder(root.left);
System.out.println(root.data);
inorder(root.right);
}
}
static void preorder(Node root)
{
if(root!=null)
{
preorder(root.left);
preorder(root.right);
System.out.println(root.data);
}
}
}
class Node 
{
int data;

Node left,right;
}



