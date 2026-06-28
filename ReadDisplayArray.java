import java.util.Scanner;
class ReadDisplayArray
{
public static void main (String args[])
{
Scanner dan = new Scanner(System.in);
System.out.println("Enter:");
int n = dan.nextInt();
int [] arr = new int[n];
System.out.println("Enter:");
for(int i= 0; i<n ; i++)
{
arr [i] = dan.nextInt();
}
System.out.println("Display:");
for (int i =0; i<n ; i++)
{
System.out.println("Elemen:" + (i+1) + " " +arr [i]);
}
dan.close();
}
}