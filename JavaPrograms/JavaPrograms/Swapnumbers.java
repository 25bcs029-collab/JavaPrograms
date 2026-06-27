import java.util.Scanner;

public class Swapnumbers

{

public static void main(String [] args)

{

Scanner scan = new Scanner(System.in);

int a,b;

System.out.println("1:");

a = scan.nextInt();

System.out.println("2:");

b = scan.nextInt();

System.out.println("before");

System.out.println("a = " + a + " b = " + b);

a = a + b;

b = a - b;

a = a - b;

System.out.println("after");

System.out.println("a = " + a + " b = " + b);

}

}