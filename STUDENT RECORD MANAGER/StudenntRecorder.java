import java.io.*;
import java.util.Scanner;

public class StudenntRecorder{
static final String FILE_NAME = "students.txt";

public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int choice;

do{
System.out.println("\n ===== STUDENT RECORD MANAGER ===== ");
System.out.println("1.add student:");
System.out.println("2.view all students:");
System.out.println("3.search students by 10:");
System.out.println("4.delete student by id:");
System.out.println("5.exit");
System.out.print("enter choice:");

choice = sc.nextInt();
sc.nextLine();

switch(choice){
case 1:
addStudent(sc);
break;

case 2:
viewAllAtudents();
break;

case 3:
searchStudent(sc);
break;

case 4:
deleteStudent(sc);
break;

case 5:
System.out.println("exit.... thank you");
break;

default:
System.out.println("Invalid choice. try again");
}
}
while(choice != 5);

sc.close();

}
}

static void addStudent(Scanner sc){
try(Bufferedwriter bw = new Bufferedwriter(new FileWriter(FILE_NAME, true))){
System.out.print("enter id:");
String id = sc.nextLine();

System.out.print("enter name:");
String name = sc.nextLine();

System.out.print("department:");
String dept = sc.nextLine();

System.out.print("year:");
String year = sc.nextLine();

System.out.print("Email:");
String email = sc.nextLine();


static void createdlistnotexist(){

try{
File file = new file(FILE_NAME);
if (file.createnewfile()){
System.out.println("file create :" + FILE_NAME);
}
}catch(IOException e){
System.out.println("error created file" + getmessage());
}
}












