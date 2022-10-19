package bt3;

public class LazyPrimeFactoriztion implements Runnable {
    private Thread T;
    private int num ;

    public LazyPrimeFactoriztion(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        boolean check = true;
        System.out.println("Lazy run : ");
        for (int i = 2; i <=num/2 ; i++) {
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
