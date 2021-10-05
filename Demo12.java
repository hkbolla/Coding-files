import java.math.BigDecimal;
public class Demo12
{
public static void main(String [] args)
{
Product p1=new Product();
BigDecimal percentage=BigDecimal.valueOf(0.2);
final BigDecimal amount=p1.getDiscount(percentage);
System.out.println(amount);
}
}
 class Product 
{
private final String name="TEA";
private final BigDecimal  price=BigDecimal.valueOf(200);
public BigDecimal getDiscount(final BigDecimal discount)
{
return  price.multiply(discount);
}
}

