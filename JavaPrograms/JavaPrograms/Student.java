class Student{
int id;
String name;

Student(){
id = 1;
name = "not assigined";
}

void display(){
System.out.println(id + " " + name);
}

public static void main(String[] args)
{
Student s = new Student();
s.display();
}
}