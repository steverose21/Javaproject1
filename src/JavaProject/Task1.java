package JavaProject;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int [] numbers= new int[2];
        int[] numbers1 = numbers;
        int sum=0;
        for (int i = 0; i < numbers1.length; i++) {
            System.out.println("Please enter a number");
            numbers1[i]= scanner.nextInt();
            System.out.println("Please enter another number");
            numbers1[i]= scanner.nextInt();
            sum=sum+ numbers1[i];
            System.out.println("The sum of those numbers are "+sum);
        }
    }





}
