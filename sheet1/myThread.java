package Java.DistributedSystem.sheet1;

public class myThread extends Thread implements Runnable{

    public static int count = 1;
    private int num;

    public myThread(int num) throws InterruptedException {
        this.num = count++;
        letSleep();
    }

    public myThread() {
    }

    public  void letSleep() throws InterruptedException {
        for(int i = 1 ; i <= 5 ; i++){
            if(i%2 == 0) {
                Thread.sleep(2000);
            }
            this.print();
        }

    }
    public void print(){
        System.out.println(this.num);
    }
}
