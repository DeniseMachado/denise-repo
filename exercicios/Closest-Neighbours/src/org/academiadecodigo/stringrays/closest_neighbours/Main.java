package org.academiadecodigo.stringrays.closest_neighbours;

public class Main {

    public static void main(String[] args) {

        int[] myArray = {0, 5, 1209, 6, 2, 111, 112, 33};
        int[] result = findClosest(myArray);


        System.out.println("\nThe closest neighbours are: " + result[0] + " " + result[1]);

    }

    private static int[] findClosest(int[] number) {

        int diference = Math.abs(number[0] - number[1]);
        int[] closest = new int[2];

        for (int i = 0; i < number.length - 1; i++) {
            int min = number[i] - number[i + 1];
            if (Math.abs(number[i] - number[i + 1]) < diference) {
                diference = min;
                closest[0] = number[i];
                closest[1] = number[i + 1];
            }
        }
        return closest;
    }

}

