class MyThread extends Thread{
int start;
int end;
MyThread(int start, int end){
this.start = start;
this.end = end;
}
public void run(){
for(int i = start; i <= end; i ++){
System.out.println(Thread.currentThread().getName() + " " + i);
}
}
}
public class AsyncExample{
public static void main(String[] args){
MyThread t1 = new MyThread(1,10);
MyThread t2 = new MyThread(90,100);
t1.start();
t2.start();
}
}

