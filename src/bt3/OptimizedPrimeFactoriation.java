package bt3;

public class OptimizedPrimeFactoriation implements Runnable {
    private Thread T ;
    private int num;

    public OptimizedPrimeFactoriation(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        boolean check = true;
        System.out.println("Optimized run : ");
        for (int i = 2; i <= Math.sqrt(num) ; i++) {
            int temp=num%i;

            if (temp==0){
                check = false;
                break;
            }
        }
        if(check){
            System.out.println(" - " +  num + " La so nguyen to ! ");
        }else {
            System.out.println(" - " +  num + " Khong phai so nguyen to ! ");
        }

    }
}
