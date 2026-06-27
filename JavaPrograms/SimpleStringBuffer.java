//To create a Java program that utilizes the StringBuffer class to perform string operations: determine string length, reverse the string, and delete a specified substring.

import java.util.Scanner; 
public class SimpleStringBuffer { 
public static void main(String[] args) { 
Scanner scanner = new Scanner(System.in); 
// Input string 
System.out.print("Enter a string: "); 
StringBuffer sb = new StringBuffer(scanner.nextLine()); 
// Length of the string 
System.out.println("Length: " + sb.length()); 
// Reverse the string 
System.out.println("Reversed: " + sb.reverse()); 
// Delete a substring 
System.out.print("Start index to delete: "); 
int start = scanner.nextInt(); 
System.out.print("End index to delete: "); 
int end = scanner.nextInt(); 
if (start >= 0 && end <= sb.length() && start < end) { 
sb.delete(start, end); 
System.out.println("After deletion: " + sb); 
} else { 
System.out.println("Invalid indices."); 
} 
} 
}