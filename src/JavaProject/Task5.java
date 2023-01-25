package JavaProject;

public class Task5 {
    public static void main(String[] args) {
        int[][] numbers={{9,15,27,43},
                {80,30,54,64}
        };
        int totalEven=0;
        int totalOdds=0;


        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if(numbers[i][j]%2==0) {
                    totalEven =totalEven+ numbers[i][j];
                } else {
                    totalOdds =totalOdds+ numbers[i][j];
                }
            }
        }
        System.out.println("The total of Even numbers is "+totalEven);
        System.out.println("The total of Odd numbers is "+totalOdds);
    }
}
