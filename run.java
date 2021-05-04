class A implements Runnable
{
public void run()
{
for(int i=1;i<=10;i++)
{
System.out.println("it  thread A"+i);
}
System.out.println("end of the thread A");
}
}
class B implements Runnable
{
public void run()
{
for(int i=1;i<=10;i++)
{
System.out.println("it  thread B"+i);
}
System.out.println("end of the thread B");
}
}
class C implements Runnable
{
public void run()
{
for(int i=1;i<=10;i++)
{
System.out.println("it thread C"+i);
}
System.out.println("end of thread C");
}
}
class TestThread
{
public static void main(String args[])
{
A a1= new A();
Thread t1=new Thread(a1);
t1.start();
B b1=new B();
Thread t2=new Thread(b1);
t2.start();
C c1=new C();
Thread t3=new Thread(c1);
t3.start();
}
}
