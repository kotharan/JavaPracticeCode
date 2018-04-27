
//Design a java class to implement a thread.(date and time)

package tt;
import java.util.*;
public class Tt extends Thread{


public Tt()
{
start();
}

 public void run()
{
for(;;)
{
Date d=new Date();
System.out.println(d.toString());
try
{
Thread.sleep(1000);
}
catch(InterruptedException ie)
{

}
}
}
public static void main(String args[])
{
Tt obj=new Tt();
}
}
