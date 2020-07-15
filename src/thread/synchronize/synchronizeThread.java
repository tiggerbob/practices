package thread.synchronize;
/*
* methods for threads:
* start(): starts the thread
* stop(): force stops the thread (highly unrecommended)
* sleep(): pause/sleep the thread for a certain number of milliseconds
* interrupt(): interrupts the thread
* interrupted(): checks if the thread has been interrupted
* join(): waits for the completion of a separate thread
* synchronized: keyword - makes methods synchronized with each other
* execute(): executor interface - replace normal start thread with .execute
* yield(): changes the state of the thread from Running to Enabled
* */

import java.util.concurrent.atomic.AtomicInteger;

class synchronizeThread {

    public static int count = 0;

    synchronized public static void count() {
        synchronized (synchronizeThread.class){
           count++;
        }

    }

    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i < 100; i++) {
            Thread threads = new Thread(new Runnable() {
                @Override
                public void run() {
                    count();
                }
            });

            threads.start();
//            System.out.println(count);
//            threads.sleep(300);
//            threads.join();
        }
        Thread.sleep(1000 );
        System.out.println(count);

    }
}

