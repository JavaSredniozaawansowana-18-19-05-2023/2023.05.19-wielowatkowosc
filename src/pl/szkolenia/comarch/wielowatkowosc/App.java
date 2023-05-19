package pl.szkolenia.comarch.wielowatkowosc;

public class App {
    public static void main(String[] args) {
        /*Watek w1 = new Watek(1);
        Watek w2 = new Watek(2);
        Watek w3 = new Watek(3);

        w1.start();
        w2.start();
        w3.start();*/

        Thread thread = new Thread(new LepszyWatek());

        thread.start();
    }
}
