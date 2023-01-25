package JavaProject;

public class Task9 {
    public static void main(String[] args) {
        int number[] = new int[]
                {33,22,44,5,18,39,4,12,44,12};

        int minimum=number[0];
        int maximum=number[0];

        for (int j = 1; j < number.length; j++) {
            if(number[j]>maximum){
                maximum=number[j];
            }else if(number[j]<minimum){
                minimum=number[j];
            }
        }
        System.out.println("The smallest number is "+minimum);
        System.out.println("The largest number is "+maximum);
    }
}
