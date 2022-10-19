package bt3;

public class Main {
    public static void main(String[] args) {
        LazyPrimeFactoriztion Lazy = new LazyPrimeFactoriztion(11);
        OptimizedPrimeFactoriation Optimized = new OptimizedPrimeFactoriation(11);
        Thread th1 = new Thread(Lazy);
        Thread th2 = new Thread(Optimized);
        th1.start();
        try {
            th1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        th2.start();
    }
}