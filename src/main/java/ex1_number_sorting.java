import java.util.Arrays;
import java.util.Scanner;

public class ex1_number_sorting {

    //The process of finding the largest value (i.e., the maximum of a group of values) is used frequently in computer
    //applications. For example, a program that determines the winner of a sales contest would input the number of
    //units sold by each sales person. The sales person who sells the most units wins the contest. Write a Java
    //application that inputs a series of 10 integers and determines and prints the largest integer. Your program should
    //use at least the following three variables:
    //a. counter: A counter to count to 10 (i.e., to keep track of how many numbers have been input and to
    //determine when all 10 numbers have been processed).
    //b. number: The integer most recently input by the user.
    //c. largest: The largest number found so far.

    public static void main(String[] args) {

        System.out.println(Arrays.toString(sortNumbers()));

    }

    public static int[] takeNumbers() {
        Scanner scanNumbers = new Scanner(System.in);
        int[] tab1 = new int[10];
        System.out.println("Podaj 10 liczb naturalnych.");
        for (int i = 0; i < tab1.length; i++) {
            tab1[i] = scanNumbers.nextInt();
        }
        return tab1;
    }

    public static int[] sortNumbers() {
        int[] tabSorted = takeNumbers();
        int counter = 0;


        for (int i = 0; i < tabSorted.length - 1; i++) {
            counter++;
            for (int j = 0; j < tabSorted.length- counter; j++) {
                if (tabSorted[j + 1] < tabSorted[j]) {
                    int a = tabSorted[j];
                    tabSorted[j] = tabSorted[j + 1];
                    tabSorted[j + 1] = a;
                }
            }


        }
        return tabSorted;
    }

}
