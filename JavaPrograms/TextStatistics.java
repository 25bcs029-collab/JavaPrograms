//Write a Java program that reads a text file and displays the number of characters, lines, and words in the file. 

import java.io.BufferedReader; 
import java.io.FileReader; 
import java.io.IOException; 
public class TextStatistics { 
public static void main(String[] args) { 
String filePath = "path/to/your/textfile.txt"; // Change to your file path 
try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) { 
String line; 
int characterCount = 0; 
int lineCount = 0; 
int wordCount = 0; 
while ((line = reader.readLine()) != null) { 
lineCount++; 
characterCount += line.length(); 
wordCount += line.split("\\s+").length; // Split by whitespace 
} 
System.out.println("Characters: " + characterCount); 
System.out.println("Lines: " + lineCount); 
System.out.println("Words: " + wordCount); 
} catch (IOException e) { 
e.printStackTrace(); 
} 
} 
} 
