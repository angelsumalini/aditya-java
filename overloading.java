class method1
{
void run()
{
System.out.println("bike is running");
}
}
class method2 extends method1
{
void run()
{
System.out.println("bike is running safely");
}
}
class inherit
{
public static void main(String args[])
{
method2 m1=new method2();
m1.run();
}
}