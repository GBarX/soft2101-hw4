package hmk1;

import java.util.Scanner;

public class RangePrinter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first num: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter second num: ");
        int num2 = scanner.nextInt();

        printRange(num1, num2);
    }

    public static void printRange(int start, int end) {
    for(int i = start+1; i < end; i++){
        if(i % 2 == 0) {  
            System.out.println(i);
        }
    }
}
}