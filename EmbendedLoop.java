class EmbendedLoop
{
public static void main(String [] args)
{
char [][] game={{'o','x','x'},
                {'x','x','o'},
                {'o',' ','o'}};
StringBuilder txt=new StringBuilder();
for(int x=0;x<game.length;x++)
{
/*int y=0;
while(y <game[x].length)
{
txt.append(game[x][y]);
y++;
}*/
for(int y=0;y<game[x].length;y++)
{
txt.append(game[x][y]);

}
txt.append('\n');
}

for(char [] row:game)
{
for(char value:row)
{
txt.append(value);
}
txt.append('\n');
}
System.out.println(txt);

}
}
