package pl.szkolenia.comarch.incrementator;

public class App {
    public static int counter = 0;
    //public static final Object lock = new Object();

    public static void main(String[] args) {
        SynchronizedIncrementator si = new SynchronizedIncrementator();

        Thread t1 = new Thread(new Incrementator(si));
        Thread t2 = new Thread(new Incrementator(si));
        Thread t3 = new Thread(new Incrementator(si));
        Thread t4 = new Thread(new Incrementator(si));

        //si = new SynchronizedIncrementator();

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            System.out.println("zepsulo sie !!");
        }

        System.out.println(counter);
    }
}
