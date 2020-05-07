package thread.synchronize;
/*
* methods for threads:
* start(): starts the thread
* stop(): force stops the thread (highly unreccomended)
* sleep(): pause/sleep the thread for a certain number of milliseconds
* interrupt(): interrupts the thread
* interrupted(): checks if the thread has been interrupted
* join(): waits for the completion of a separate thread
* synchronized: keyword - makes methods synchronized with each other
* execute(): executor interface - replace normal start thread with .execute
* */

class synchronizeThread {

    public static void main(String[] args) throws InterruptedException {
        String[] importantInfo = {
                "Mares eat oats",
                "Does eat oats",
                "Little lambs eat ivy",
                "A kid will eat ivy too"
        };

        for (String s : importantInfo) {
            Thread.sleep(4000);
            System.out.println(s);
        }
    }
}

