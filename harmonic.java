import java.io.*;
class harmonic
{
public static void main(String args[])
{
int i;double s=0;
int r=Integer.parseInt(args[0]);
System.out.println("r values is="+r);
for(i=1;i<=r;i++);
{
s=(s+1)/(double)i;
}
System.out.println("sum of values="+s);
}
}