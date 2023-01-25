package JavaProject;

public class Task11 {
    public static void main(String[] args) {
        String[] arr = {"Han", "John", "Dave", "Stephan","Armin","Homer","Caleb","Han","John"};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+ 1; j < arr.length; j++) {
                if(arr[j].equals(arr[i])){
                    System.out.println(arr[j]);
                }
            }
        }
    }
}
