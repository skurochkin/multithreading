package CreatingThreadByExtendingThreadClass;

/**
 * Created by VKurochkin on 8/30/2016.
 */

class Cat extends Thread {
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
        Cat runner1 = new Cat();
        runner1.start();

        Cat runner2 = new Cat();
        runner2.start();
    }
}
