package org.academiadecodigo.stringrays.prompt_view;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.string.StringInputScanner;

import java.util.ArrayList;

public class PromptView {


    public static void main(String[] args) {
        PromptView prompt = new PromptView();
        Menu menu = new Menu();
        menu.menuCreation();
        prompt.login();
    }

    private ArrayList<User> users = new ArrayList();

    public void login() {

        Prompt prompt = new Prompt(System.in, System.out);
        System.out.println("\n-------------WELCOME------------");


        StringInputScanner question = new StringInputScanner();
        question.setMessage("\n<USERNAME>: ");

        StringInputScanner question1 = new StringInputScanner();
        question1.setMessage("\n<PASSWORD>: ");


        String user = prompt.getUserInput(question);
        String password = prompt.getUserInput(question1);

        users.add(new User("Denise", "aabb"));
        users.add(new User("Axl", "axl"));


        for (User user1 : users) {
            if (user1.getName().equals(user) && user1.getPassword().equals(password)) {
                System.out.println("\nLogin Successful");
                return;
            }
        }

        System.out.println("LOGIN FAIL");

    }

}
