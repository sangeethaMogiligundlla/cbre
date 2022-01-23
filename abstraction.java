//program for abstraction

abstract class car
{
abstract public void speed();//abstarct method
}

class suzuki extends car
{
public void speed()
{
System.out.println("suzuki speed is 97");
}
}

public class abstraction
{
public static void main(String args[])
{
car obj=new suzuki();
obj.speed();
}
}
 