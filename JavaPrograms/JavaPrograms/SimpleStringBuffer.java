import java.util.Scanner;
public class SimpleStringBuffer{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
System.out.print("enter a string:");
StringBuffer sb = new StringBuffer(scanner.nextLine());
System.out.println("Length:" + sb.length());
System.out.println("Revered:" + sb.reverse());
System.out.print("Start index to delete:");
int start = scanner.nextInt();
System.out.print("End index to delete:");
int end = scanner.nextInt();

if (start >= 0 && end <= sb.length() && start < end ){
sb.delete(start,end);
System.out.println("after deletion:" + sb);
}else{
System.out.println("invalid indice.");
}
}
}