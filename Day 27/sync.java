class Count{
    int i;
    synchronized void inc(){
        i++;
        System.out.println(i);
    }
    // synchronized void display(){
    //     System.out.println(i);
    // }
}
class thread1 implements Runnable{
    public void run(){
        Count c = new Count();
        for (int i = 0; i < 5; i++) {
            c.inc();
        }
        //c.display();
    }
}
class thread2 implements Runnable{
    public void run(){
        Count c = new Count();
        for (int i = 0; i < 5; i++) {
            c.inc();
        }
        //c.display();
    }
}


public class sync {
    public static void main(String[] args) {
        thread1 t1 = new thread1();
        thread2 t2 = new thread2();
        Thread ob = new Thread(t1);
        Thread ob1 = new Thread(t2);
        ob.start();
        ob1.start();
    }
}
