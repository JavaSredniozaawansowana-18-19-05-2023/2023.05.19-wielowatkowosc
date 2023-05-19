package pl.szkolenia.comarch.incrementator;

public class SynchronizedIncrementator {
    public synchronized void increment() {
        App.counter++;
    }
}
