package org.academiadecodigo.stringrays.closest_neighbours;

public class ClosestNeighbours {

    public static void main(String[] args) {

        int[] myArray = {0, 5, 1209, 6, 2, 111, 112, 33};
        int[] result = findClosest(myArray);


        // print the elements of the resulting array
        System.out.println("\nThe closest neighbours are: " + result[0] + " " + result[1]);

    }

    private static int[] findClosest(int[] number) {

        int difference;
        int minDifference = Math.abs(number[0] - number[1]);
        int[] neighbours = new int[2];

        for (int i = 0; i < number.length - 1; i++) {

            difference = Math.abs(number[i] - number[i + 1]);

            if (difference <= minDifference) {
                minDifference = difference;
                neighbours[0] = number[i];
                neighbours[1] = number[i + 1];

            }
        }

        return neighbours;
         
    }

}

