class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 15; i++) {
            System.out.println(i + " T1");
            try {
                Thread.sleep(2000); // second thread waits 2 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Multithreading {
    public static void main(String[] args) {
        MyThread ti = new MyThread(); // create the thread object
        ti.start(); // start the thread

        // main thread runs immediately without waiting
        for (int i = 0; i < 5; i++) {
            System.out.println(i + " main");
        }
    }
}