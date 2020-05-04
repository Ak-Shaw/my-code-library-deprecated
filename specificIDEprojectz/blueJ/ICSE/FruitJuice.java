/* Define a class named FruitJuice with the following description:
 * 
 * Instance variables/data members:
 * int product_code   - stores the product code number
 * String flavour     - stores the flavour of the juice (E.g. orange,apple,etc.) 
 * String pack_type   - stores the type of packaging (E.g. tetra-pack,PET bottle,etc.)
 * int pack_size      - stores package size (E.g. 200 ml,400 ml,etc.)
 * int product_price  - stores the price of the product
 * 
 * Member methods:
 * (i)   FruitJuice()    - Default constructor to initialize integer
 *                         data members to 0 and String data members to ""
 * (ii)  void input()    - To input and store the product code, flavour,
 *                         pack type, pack size and produt price.
 * (iii) void discount() - To reduce product price by 10
 * (iv)  void display()  - To display the product code, flavour, pack type,
 *                         pack size and product price
 *                                                           (ICSE 2013)
 */
import java.io.*;
public class FruitJuice
{
int product_code,pack_size,product_price;
String flavour,pack_type;
FruitJuice()
{
product_code=0;
pack_size=0;
product_price=0;
flavour="";
pack_type="";
}
void input()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter Product Code :");
product_code=Integer.parseInt(br.readLine());
System.out.print("Enter Flavour :");
flavour=br.readLine();
System.out.print("Enter Pack Type :");
pack_type=br.readLine();
System.out.print("Enter Pack Size :");
pack_size=Integer.parseInt(br.readLine());
System.out.print("Enter Product Price : Rs.");
product_price=Integer.parseInt(br.readLine());
}
void discount()
{
product_price-=10;
}
void display()
{
System.out.println("\f");
System.out.println("Product Code :"+product_code);
System.out.println("Flavour :"+flavour);
System.out.println("Pack Type :"+pack_type);
System.out.println("Pack Size :"+pack_size);
System.out.println("Product Price :"+product_price);
}
public static void main(String args[])throws IOException
{
FruitJuice ob=new FruitJuice();
ob.input();
ob.discount();
ob.display();
}
}

