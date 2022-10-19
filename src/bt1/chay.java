package bt1;

public class chay {
    public static void main(String[] args) {
        NumberGenerator num1= new NumberGenerator("Hncuatoi");
        NumberGenerator num2 = new NumberGenerator("Hn");
        Thread th1 = new Thread(num1.toString());
//        th1.setPriority(Thread.MAX_PRIORITY);
        th1.start();
        Thread th2 = new Thread(num2.toString());
//        th2.setPriority(Thread.MAX_PRIORITY);
        th2.start();
    }
}
