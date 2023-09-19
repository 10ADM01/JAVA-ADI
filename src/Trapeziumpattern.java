import java.util.Scanner;

public class Trapeziumpattern{
    public static void printTrapeziumPattern(int num) {
        int start = 1;
        int end = num * (num + 1);
        int spaces = 0;
        int ab =num-1;


        for (int i = num; i > 0; i--) {
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            for (int j = start; j < start + i; j++) {
                System.out.print(j + "*");
            }
            int counter=0;
            for (int j = end-ab; j<=end; j++) {
                counter++;
                System.out.print(j+"*");

            }

            System.out.println();
            start += i;
            end =+1;
            spaces += 2;

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int numLines = scanner.nextInt();
        printTrapeziumPattern(numLines);
        scanner.close();
    }
}
