class Product
{
private String name;
public void setname(String name)
{
this.name=name;
}
public String getname(){
return name;}
}
class ClassObjects{
public static void main(String [] args)
{
Product p1=new Product();
p1.setname("HKBOLLA");
System.out.println(p1.getname() + "  this is my name");
}
}
