package JavaProject;

public class Task4 {

    public static void main(String[] args) {

        int[][] numbers = {{2, 3, 5, 6, 8,},
                {10, 1, 4, 7, 9}
        };
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] % 2 == 0) {
                    System.out.println(numbers[i][j]);
                }
            }
        }


    }
}
