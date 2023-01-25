package JavaProject;

public class Task10 {
    public static void main(String[] args) {
        int [] numbers = {33, 16, 9, 22, 55};

        int largest = 0;
        int secondLargest = 0;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > largest) {
                secondLargest = largest;
                largest = numbers[i];
            } else if (numbers[i] > secondLargest) {
                secondLargest = numbers [i];
            }
        }
        System.out.println("The second largest number is "+secondLargest);
    }
}
