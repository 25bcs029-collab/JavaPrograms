class ATMTransaction extends Thread{

public void run(){
System.out.println("Transaction stated by:" + Thread currentThread().getName);

for (int i = 1 ; i < = 3 ; i + + ){
System.out.println(Thread currentThread().getName() + "prograssing step" + i);

try{
Thread sleep(1000);
}
catch(InterruptedExecption e){
System.out.println(e);
}
System.out.println("Transaction completed by::" + Thread currentThread().getNmae();