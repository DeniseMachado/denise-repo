package org.academiadecodigo.stringrays.todo_list;


import java.util.PriorityQueue;

public class TodoList {

    private PriorityQueue<Todo> priorityQueue = new PriorityQueue<>();



    public void add(String message, int priority, Importance importance) {
        priorityQueue.add(new Todo(message, priority, importance)); //PriorityQueue method


    }
    //retorna a tarefa + importante (head) e remove
    public Todo remove() {
        return priorityQueue.poll();

    }

    public boolean hasElements() {
        return (priorityQueue.size() > 0);

    }

}
