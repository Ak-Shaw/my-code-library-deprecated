class Worker
{
String name;
int basic;
Worker(String a,int b)
{
name=a;
basic=b;
}
void display()
{
System.out.println("Name :"+name);
System.out.println("Basic :Rs."+basic);
}
}
class wages extends Worker
{
int hrs;
double rate,wage;
wages(int h,double r,double w,String n,int b)
{
super(n,b);
hrs=h;
rate=r;
wage=w;
}
double overtime()
{
double a=hrs*rate;
return a;
}
void display()
{
super.display();
double amount=overtime();
System.out.println("Hours :"+hrs);
System.out.println("Rate :"+rate);
System.out.println("Wage :Rs."+wage);
System.out.println("Amount :Rs."+amount);
}
static void main()
{
wages ob=new wages(10,.12,25663.23,"Ayush",15523);
ob.overtime();
ob.display();
}
}