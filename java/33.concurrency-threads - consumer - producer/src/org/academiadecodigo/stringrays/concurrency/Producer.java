package org.academiadecodigo.stringrays.concurrency;

import org.academiadecodigo.bootcamp.concurrency.bqueue.BQueue;

/**
 * Produces and stores integers into a blocking queue
 */


public class Producer implements Runnable {

    private final BQueue<Integer> queue;
    private int elementNum;


    /**
     * @param queue      the blocking queue to add elements to
     * @param elementNum the number of elements to produce
     */

    public Producer(BQueue queue, int elementNum) {
        this.queue = queue;
        this.elementNum = elementNum;
    }

    private void produce() {
        try {
            for (int i = 0; i < elementNum; i++) {
                Thread.sleep(1000);
                queue.offer(i);
            }
        } catch (InterruptedException ex) {
            ex.getMessage();
        }
    }


    @Override
    public void run() {
        produce();
      //  System.out.println("Ofered: " + Thread.currentThread().getName());

    }


}




