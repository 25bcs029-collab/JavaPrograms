class Demo 
{
void m1()
{
System.out.println("m1");
}

void m2() 
{
this.m1();
System.out.println("m2");
}
}

class Main
{
public static void main(String[] args) 
{
Demo d = new Demo();
d.m2();
}
}