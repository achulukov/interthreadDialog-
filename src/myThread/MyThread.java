package myThread;

public class MyThread extends Thread{
    @Override
    public void run() {
        try {
            while(!isInterrupted()) {
                Thread.sleep(2500);
                System.out.printf("� %s .���� ������!\n", getName());
            }
        } catch (InterruptedException err) {

        } finally{
            System.out.printf("%s ��������\n", getName());
        }
    }
}
