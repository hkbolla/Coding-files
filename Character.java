class Character
{
public static void main(String []args)
{
char somechar='!';
if(somechar>='a' && somechar<='z')
{
somechar-=32;
System.out.println(somechar);
}
else
{if(somechar>='A' && somechar<='Z')
{
somechar+=32;
System.out.println(somechar);
}
}
}
} 
