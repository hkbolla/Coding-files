import java.util.Scanner;
import java.util.Collections;
import java.util.Arrays;

class Anagrams
{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
String str1=sc.nextLine();
char c1[]=new char[str.length()];
char [] c2=new char[str1.length()];

for(int i=0;i<str.length();i++)
{
c1[i]=str.charAt(i);
c2[i]=str1.charAt(i);
}

boolean f=anagram(c1,c2);
if(f==true)
{
System.out.println("anagram");
}
else
{
System.out.println("no anagram");
}

}
static boolean anagram(char []c1,char [] c2)

{
if(c1.length!=c2.length)
{
return false;
}
else
{
Arrays.sort(c1);
Arrays.sort(c2);

for(int i=0;i<c1.length;i++)
{
if(c1[i]==c2[i])
{
return true;
}
else
{
return false;
}
}
}
return false;
}
}