package bt1;



public class NumberGenerator implements Runnable {
    private Thread T;
    private final String threadName;

    public NumberGenerator(String threadName) {
        this.threadName = threadName;
    }


    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println( "THREAD : " + threadName + " - " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
    public void start(){
        System.out.println("Start " + threadName);
        if(T==null){
            T=new Thread(this, threadName);
            T.start();
        }
    }
}
