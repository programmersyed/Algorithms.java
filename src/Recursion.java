import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        //useful for factorials, traversing trees, and simplifying expressions
        Scanner scan = new Scanner(System.in);
        System.out.println("How many times do you want to say hello");
        int num = scan.nextInt();
        HelloWorld(num);


    }

    static void HelloWorld(int n) {
        //Base case
        if (n > 0) {
            System.out.println("Hello World! " + n);
            n--;

            HelloWorld(n);
        }


    }
}
