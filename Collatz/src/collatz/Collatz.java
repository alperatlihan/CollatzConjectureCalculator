
package collatz;

import java.util.Scanner;

public class Collatz {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 1;
        System.out.println("Enter natural numbers, you can finish with 0:");
        while (true) {
            int number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            int stepCount = calculateStepCount(number);
            System.out.println(counter + ". number (" + number + ") finishes in " + stepCount + " steps");
            counter++;
        }
    }

    public static int calculateStepCount(int number) {
        int stepCount = 1;
        while (number != 1) {
            switch (number % 2) {
                case 0:
                    number = number / 2;
                    break;
                case 1:
                    number = 3 * number + 1;
                    break;
            }
            stepCount++;
        }
        return stepCount;
    }
}
