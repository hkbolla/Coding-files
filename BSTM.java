import java.util.Scanner;
class Node
{
Node right,left;
int data;
}
class BSTM
{
static Scanner sc=new Scanner(System.in);
static Node root=null;
static int choice;
public static void main(String [] args)
{
System.out.println("Enter the choice:");


while(true)
{
System.out.println("1.insert \n 2.delete \n 3.inorder \n 4.preorder\n 5.exit");
choice=sc.nextInt();

switch(choice)
{
case 1:
System.out.println("Enter the data to insert");
int x=sc.nextInt();
insert(root,x);
break;
case 2:
int y=sc.nextInt();
delete(root,y);

case 3:
inorder(root);
break;
case 4:
preorder(root);
break;
case 5:
System.exit(0);

break;
default :
break;


}
}
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
else if (root.data<y)
{
root.left=delete(root.left,y);
}
else if(root.data>y)
{
root.right= delete(root.right,y);
}
else
{
if(root.right==null)
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
}
return root;
}

static  int min(Node root)
{
while(root.right!=null)
{
root=root.right;
}
return root.data;
}
public static void inorder(Node root)
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
if(root!=null);
{
System.out.println(root.data);
preorder(root.left);
preorder(root.right);
}
}

}

