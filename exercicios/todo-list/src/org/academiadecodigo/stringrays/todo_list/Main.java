package org.academiadecodigo.stringrays.todo_list;

import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {

        TodoList list = new TodoList();

        list.add("Water", 1, Importance.MEDIUM);
        list.add("Coffee", 1, Importance.HIGH);
        list.add("Wine", 0, Importance.HIGH);
        list.add("Tea", 0, Importance.LOWER);


        //Todo newTodo = new Todo("Dormir", 1, Importance.HIGH);
        //Todo newTodo1 = new Todo("Eat", 0, Importance.LOWER);

        // System.out.println(newTodo.compareTo(newTodo1));

        while (list.hasElements()) {
            System.out.println(list.remove());
            System.out.println(list.hasElements());
        }

        System.out.println("\n" + list.hasElements());

        list.remove();
        list.remove();
        System.out.println(list.remove());

    }


}
