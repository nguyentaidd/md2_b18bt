package bt2;

public class OddThread implements Runnable{

    @Override
    public void run() {
        for (int i = 1; i <10 ; i++) {
            if (i%2!=0) {
                System.out.println("Odd: " + i);
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
