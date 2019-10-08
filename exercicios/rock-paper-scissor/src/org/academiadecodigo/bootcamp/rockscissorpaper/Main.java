package org.academiadecodigo.bootcamp.rockscissorpaper;

public class Main {

    public static void main(String[] args) {

        Player p1 = new Player();//name: Ricardo - esta a iniciaizar a propriedade name de nome Ricardo
        Player p2 = new Player();

        Game rockpaperscissor = new Game(p1, p2, 10); //Estou a invocar um método Game da classe Game. Estamos a invocar o método construtor. Tem o mesmo nome da classe.
        //Se usasse o mesmo contrutor e o mesmo nome estavamos a fazer o metodo overload

        rockpaperscissor.play(); //invocar o metodo play sobre o metodo que esta guardado nesta variável.


    }
}
