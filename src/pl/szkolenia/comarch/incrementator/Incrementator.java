package pl.szkolenia.comarch.incrementator;

public class Incrementator implements Runnable {

    SynchronizedIncrementator si;
    public Incrementator(SynchronizedIncrementator si) {
        this.si = si;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            this.si.increment();
        }
    }
}
