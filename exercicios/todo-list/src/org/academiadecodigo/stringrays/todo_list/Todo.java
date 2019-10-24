package org.academiadecodigo.stringrays.todo_list;

public class Todo implements Comparable<Todo> {

    private String message;
    private int priority;
    private Importance importance;


    public Todo(String message, int priority, Importance importance) {
        this.message = message;
        this.priority = priority;
        this.importance = importance;
    }

    @Override
    public String toString() {
        return message;
    }

    @Override
    //return 1 less than, 0 - equal to, -1 - greater than
    public int compareTo(Todo todo) {
        if (this.importance == todo.importance) {
            if (this.priority > todo.priority) {
                return -1;
            }
            if (this.priority < todo.priority) {
               // System.out.println("Here");
                return 1;
            }
            return 0;
        }
        return this.importance.compareTo(todo.importance);

    }
}






