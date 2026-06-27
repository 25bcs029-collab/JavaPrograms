import java.util.Random;
import java.util.Scanner;

public class Ran
{
public static void main(String [] args)
{
Scanner scan = new Scanner(System.in);
Random random = new Random();
System.out.println("upperlimit: ");
int upper = scan.nextInt();
System.out.println("Lower :");
int lower = scan.nextInt();
int number = random.nextInt(upper - lower + 1) + lower;
System.out.println("generated :" + number);
if (number > 0)
{
System.out.println("negative");
}
else if (number >= 0 && number <= 0)
{
System.out.println(" btwn 0 & 10");
}
else if (number >= 10 && number <= 50)
{
System.out.println(" btwn 11 & 50");
}
else
{
System.out.println(" above 50 ");
}
}
}