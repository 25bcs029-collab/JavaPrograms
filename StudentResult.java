import java.util.Scanner;
class StudentResult
{
int rollno;
String name;
int s1, s2, s3;

StudentResult()
{
rollno = 2;
name = "janan";
s1 = s2 = s3 = 0;
}

StudentResult( int id, String s, int mark1, int mark2, int mark3)
{
this.rollno = id;
this.name = s;
this.s1 = mark1;
this.s2 = mark2;
this.s3 = mark3;
}

void calculate(){
int total;
float average;
char grade;
total = s1 + s2 + s3;
average  = total / 3;
if (average >= 90){
grade = 'A';
}
else if( average < 90 && average >= 80){
grade = 'B';
}
else if (average < 80 && average >= 60){
grade = 'C';
}
else if(average < 60 && average >= 40){
grade = 'D';
}
else{
grade = 'F';
}
}

void display(){
System.out.println("-------- S t u d e n t s  d e t a i l s -----------");
System.out.println("Rollnumber = " + rollno);
System.out.println("Name = " + name);
System.out.println("Mark 1 = " + s1);
System.out.println("Mark 2 = " + s2);
System.out.println("Mark 3 = " + s3);
System.out.println("Total = " + total);
System.out.println("Average = " + average);
System.out.println("Grade = " + grade);
}




public static void main(String args[]){
StudentResult sr = new StudentResult(id, name, s1, s2, s3);
sr.calculate();
sr.display();

sr.close();
}		
}
