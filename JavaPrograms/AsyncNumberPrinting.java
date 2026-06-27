//To implement a Java program that uses multi-threading to print numbers from 1 to 10 and from 90 to 100 asynchronously using the same method

class NumberPrinter extends Thread { 
private final int start; 
private final int end; 
public NumberPrinter(int start, int end) { 
this.start = start; 
this.end = end; 
} 
@Override 
public void run() { 
for (int i = start; i <= end; i++) { 
System.out.println(i); 
try { 
Thread.sleep(500); // Pause for visibility 
} catch (InterruptedException e) { 
Thread.currentThread().interrupt(); 
} 
} 
} 
} 
public class AsyncNumberPrinting { 
public static void main(String[] args) { 
Thread t1 = new NumberPrinter(1, 10); 
Thread t2 = new NumberPrinter(90, 100); 
t1.start(); 
t2.start(); 
} 
} 