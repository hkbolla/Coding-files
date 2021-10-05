class ArraysExample
{
public static void main(String [] args)
{
int [][]matrix={{1,2,3},{4,5,6},{7,8,9}};
for(int i=0,j=2;!(i==3 ||j==-1);i++,j--)
{
int value=matrix[i][j];
System.out.println(value);
}
}
}
