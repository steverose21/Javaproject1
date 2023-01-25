package JavaProject;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] countries = new String[3];
        String[] capitals = new String[3];

        int input1 = 0;
        int input2=0;
        while (input1 < countries.length) {
            System.out.print("Enter name of the country: ");
            countries[input1] = input.nextLine();
            System.out.print("Enter it's capital: ");
            capitals[input1] = input.nextLine();
            input1++;
        }
        while(input2 < capitals.length) {
            System.out.println(capitals[input2] + " is the capital of " + countries[input2]);
            input2++;
        }
    }




}
