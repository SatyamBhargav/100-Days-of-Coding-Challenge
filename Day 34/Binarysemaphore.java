import java.util.concurrent.Semaphore;

public class Binarysemaphore {
  public static void main(String[] args) {
      Semaphore semaphore = new Semaphore(1);
      new Thread(new Process(semaphore, "A")).start();
      new Thread(new Process(semaphore, "B")).start();
      new Thread(new Process(semaphore, "C")).start();
      new Thread(new Process(semaphore, "D")).start();
  }
}
class Process implements Runnable {
  Semaphore semaphore;
  String name;
public Process(Semaphore semaphore, String name) {
      this.semaphore = semaphore;
      this.name = name;
  }

  public void run() {
      try {
          semaphore.acquire();
          System.out.println(name + " is in critical section");
          Thread.sleep(1000);
          System.out.println(name + " is out of critical section");
          semaphore.release();
      } catch (InterruptedException e) {
          e.printStackTrace();
      }
  }
}