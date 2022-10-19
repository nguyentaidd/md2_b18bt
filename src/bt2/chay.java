package bt2;

public class chay {
    public static void main(String[] args) {
        EvenThread eventThread = new EvenThread();
        OddThread oodThread =new OddThread();
        Thread tOdd = new Thread(oodThread);
        Thread tEvent = new Thread(eventThread);
        tOdd.start();
        try {
            tOdd.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        tEvent.start();
    }
}
