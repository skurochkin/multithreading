package CreatingThreadByImplementingRunable;

/**
 * Created by VKurochkin on 8/30/2016.
 */

class Cat implements Runnable {
    public void run(){
        for(int i = 0; i < 10; i++){
            System.out.println("Step: " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Animal {

    public static void main(String[] args) {
        Thread runner1 = new Thread(new Cat());
        runner1.start();

        Thread runner2 = new Thread(new Cat());
        runner2.start();
    }
}
