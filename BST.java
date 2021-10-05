import java.util.Scanner;
class Node
{
Node left,right;
int data;
}

class BST
{
static Node root=null;
static Scanner sc=new Scanner(System.in);
public static void main(String [] args)
{
int choice=sc.nextInt();
do
{
System.out.println("1.insert");
System.out.println("2.delete");
System.out.println("3.display");
System.out.println("4.Preorder");
System.out.println("5.inorder");
System.out.println("6.postorder");

switch(choice)
{
case 1:
System.out.println("enter the data to insert");
int x=sc.nextInt();
insert(root,x);
break;
case 2:
System.out.println("enter the key to delete");
int y=sc.nextInt();
delete(root,y);
break;

case 3:
preorder(root);
break;
case 4:
inorder(root);
break;
case 5:
postorder(root);
break;
case 6:
max(root);
break;
case 7:
min(root);
break;
case 8:
break;

}
}
while(choice!=8);
}
static Node insert(Node root,int x)
{
if(root==null)
{
root=new Node();
root.data=x;
root.left=null;
root.right=null;
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
if(root.left==null && root.right==null)
{
return root;
}
else if(root.right==null)
{
return root.left;
}
else if(root.left==null)
{
return root.right;
}

else
{
root.data=min(root.right);
root.right=delete(root.right,root.data);
}

}return root;
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
static void postorder(Node root)
{
if(root!=null)
{
System.out.println(root.data);
postorder(root.left);
postorder(root.right);
}
}
static int min(Node root)
{
while(root.left!=null)
{
root=root.left;
}
return root.data;
}
static int max(Node root)
{
while(root.right!=null)
{
root=root.right;
}
return root.data;
}
}

