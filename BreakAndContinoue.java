class BreakAndContinoue
{
public static void main(String [] args)
{
char [][] matrix={{'A','B','C','D','E'},{'F','G','H','I','K'},{'L','M','N','O','P'},
{'Q','R','S','T','U'},
{'V','W','X','Y','W'}};
StringBuilder txt=new StringBuilder();
Hari:
for(char [] rows:matrix)
{
for(char value:rows)
{
if(value=='C')
{
continue;
}
if(value=='H')
{
continue Hari;
}
if(value=='N')
{
break;
}
if(value=='S')
{
break Hari;
}
txt.append(value);
}
txt.append('\n');
}
System.out.println(txt);
}
}
