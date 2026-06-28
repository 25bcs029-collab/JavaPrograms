Abstract class Vechile{
vechile(){
System.out.println("vechile constructor");
}
Abstract void start();
}
class Bike extends Vechile{
void start(){
System.oout.println("Bike starts with a kick");
}
}
Public class AbstractClass{
public static void main(String[] args){
new Vechile = new Bike;
}
}