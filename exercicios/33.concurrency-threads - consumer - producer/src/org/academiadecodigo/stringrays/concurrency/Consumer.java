package org.academiadecodigo.stringrays.concurrency;

import org.academiadecodigo.bootcamp.concurrency.bqueue.BQueue;

public class Consumer implements Runnable {

    private final BQueue<Integer> queue;
    private int elementNum;


    /**
     * @param queue      the blocking queue to consume elements from
     * @param elementNum the number of elements to consume
     */

    public Consumer(BQueue queue, int elementNum) {
        this.queue = queue;
        this.elementNum = elementNum;

    }

    public void consume() {
        try {
            for (int i = 0; i < elementNum; i++) {
                Thread.sleep(2000);
                queue.poll();
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }


    @Override
    public void run() {
        consume();


    }

}


