import mythread.MyThread;

public class Main {
    public static void main(String[] args) {
        ThreadGroup mainGroup = new ThreadGroup("main group");

        MyThread myThread1 = new MyThread();
        myThread1.setName("поток 1");
        MyThread myThread2 = new MyThread();
        myThread1.setName("поток 2");
        MyThread myThread3 = new MyThread();
        myThread1.setName("поток 3");
        MyThread myThread4 = new MyThread();
        myThread1.setName("поток 3");

        Thread thread1 = new Thread(mainGroup, myThread1);
        Thread thread2 = new Thread(mainGroup, myThread2);
        Thread thread3 = new Thread(mainGroup, myThread3);
        Thread thread4 = new Thread(mainGroup, myThread4);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        try {
            Thread.sleep(15000);
        } catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
        mainGroup.interrupt();

        System.out.println("Останавливаю поток");
    }
}
