//To develop a Java program that demonstrates fundamental string operations, including String Concatenation, Substring Search, and Substring Extraction.

import java.util.Scanner; 
public class SimpleStringOperations { 
public static void main(String[] args) { 
Scanner scanner = new Scanner(System.in); 
// Concatenation 
System.out.print("Enter the first string: "); 
String str1 = scanner.nextLine(); 
System.out.print("Enter the second string: "); 
String str2 = scanner.nextLine(); 
String concatenated = str1 + str2; 
System.out.println("Concatenated String: " + concatenated); 
// Search for a substring 
System.out.print("Enter a substring to search: "); 
String substring = scanner.nextLine(); 
if (concatenated.contains(substring)) { 
System.out.println("Substring found!"); 
} else { 
System.out.println("Substring not found."); 
} 
// Extract a substring 
System.out.print("Enter start index: "); 
int start = scanner.nextInt(); 
System.out.print("Enter end index: "); 
int end = scanner.nextInt(); 
if (start >= 0 && end <= concatenated.length()) { 
String extracted = concatenated.substring(start, end); 
System.out.println("Extracted Substring: " + extracted); 
} else { 
System.out.println("Invalid indices."); 
} 
} 
}