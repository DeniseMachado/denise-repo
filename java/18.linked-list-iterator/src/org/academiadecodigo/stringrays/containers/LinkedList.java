package org.academiadecodigo.stringrays.containers;

import java.util.Iterator;

/**
 * A simple Linked List container implementation
 *
 * @param <T>
 */

public class LinkedList<T> implements Iterable<T> {

    private Node head;
    private int length = 0;

    public LinkedList() {
        head = new Node(null);
    }

    public int size() {
        return length;
    }


    /**
     * Adds an element to the end of the list
     *
     * @param data the element to add
     */
    public void add(T data) {

        Node node = new Node(data);
        Node iterator = head;

        while (iterator.getNext() != null) {
            iterator = iterator.getNext();
        }
        iterator.setNext(node);
        length++;

    }

    /**
     * Obtains an element by index
     *
     * @param index the index of the element
     * @return the element
     */
    public T get(int index) {

        Node iterator = head.getNext();

        while(iterator != null) {
            if (index == 0) {
                return iterator.getData();
            }
            iterator = iterator.getNext();
            index--;
        }

        return iterator.getData();

    }

    /**
     * Returns the index of the element in the list
     *
     * @param data element to search for
     * @return the index of the element, or -1 if the list does not contain element
     */
    public int indexOf(T data) {

        int index = 0;
        Node iterator = head.getNext();

        while (iterator != null) {

            if (iterator.getData().equals(data)) {
                return index;
            }
            iterator = iterator.getNext();
            index++;
        }
        return -1;
    }

    /**
     * Removes an element from the list
     *
     * @param data the element to remove
     * @return true if element was removed
     */
    public boolean remove(T data) {
        Node previous = head;
        Node iterator = head.getNext();

        while (iterator != null) {

            if (iterator.getData().equals(data)) {
                previous.setNext(iterator.getNext());
                length--;
                return true;
            }

            previous = iterator;
            iterator = iterator.getNext();
        }
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<T> {

        Node iterator = head;

        @Override
        public boolean hasNext() {
            return iterator.next != null;
        }

        @Override
        public T next() {
            iterator = iterator.getNext();
            return iterator.getData();
        }

        @Override
        public void remove() {
            LinkedList.this.remove(iterator.getData());
        }
    }

    /**
     * Linked List Node, used internally by the LinkedList class only
     */

    private class Node {

        /**
         * Reference to the next Node in the list
         */

        private T data;
        private Node next;

        public Node(T data) {
            this.data = data;
            next = null;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

}
