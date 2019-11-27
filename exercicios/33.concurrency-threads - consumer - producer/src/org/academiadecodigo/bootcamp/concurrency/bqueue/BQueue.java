package org.academiadecodigo.bootcamp.concurrency.bqueue;

import java.util.LinkedList;

/**
 * Blocking Queue
 *
 * @param <T> the type of elements stored by this queue
 */

public class BQueue<T> {

    /**
     * Constructs a new queue with a maximum size
     *
     * @param limit the queue size
     */

    private int limit;
    private int size;
    LinkedList<T> queue;


    public BQueue(int limit) {
        this.limit = limit;
        queue = new LinkedList<>();




    }

    /**
     * Inserts the specified element into the queue
     * Blocking operation if the queue is full
     *
     * @param data the data to add to the queue
     */

    public synchronized void offer(T data) {
        while (getLimit() < getSize()) {

            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
        queue.add(data);
        System.out.println(Thread.currentThread().getName() + "Added");
        notifyAll();
    }


    //return the head of this queue
    public synchronized T poll() {
        while (queue.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println(Thread.currentThread().getName() + "Removed");
        notifyAll();
        return queue.poll();
    }

    /**
     * Gets the number of elements in the queue
     *
     * @return the number of elements
     */
    public int getSize() {
        return queue.size();

    }


    /**
     * Gets the maximum number of elements that can be present in the queue
     *
     * @return the maximum number of elements
     */
    public int getLimit() {
        return limit;


    }

}
