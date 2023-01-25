package JavaProject;

public class Task6 {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 50;

        num1 = num1 - num2;
        num2 = num1 + num2;
        num1 = num2 - num1;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }
}
