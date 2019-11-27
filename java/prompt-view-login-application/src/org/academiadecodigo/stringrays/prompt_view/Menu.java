package org.academiadecodigo.stringrays.prompt_view;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;

public class Menu {

    private String[] options = new String[]{"login", "logout"};
    Prompt prompt = new Prompt(System.in, System.out);


    public void menuCreation() {
        MenuInputScanner scanner = new MenuInputScanner(options);
        scanner.setMessage("--please enter your choice--");

        int answerIndex = prompt.getUserInput(scanner);
        System.out.println(this.options[answerIndex - 1]);


        if (answerIndex == 2) {
            System.exit(0);
        }

    }
}
