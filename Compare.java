import java.Array;

public class Compare implements Comparator<String>{
  public int compare(String s1, String s2) {
    return s2.length() - s1.length();
  }
}



public class ArrayCompare
{
public static void main(String [] args)
{

String [] names = {"Mary","Jane","Elizabeth","Jo"};
Arrays.sort(names, new Compare());
for (String name: names) {
  System.out.println(name);
}
}
}
