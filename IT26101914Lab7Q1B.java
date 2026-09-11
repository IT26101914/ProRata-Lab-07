import java.util.Scanner;

public class IT26101914Lab7Q1B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int student = 1; student <= 3; student++) {
            System.out.println("Enter 4 subject marks for Student " + student + " (separated by spaces):");

            int sub1 = input.nextInt();
            int sub2 = input.nextInt();
            int sub3 = input.nextInt();
            int sub4 = input.nextInt();

            double average = (sub1 + sub2 + sub3 + sub4) / 4.0;

            System.out.println("Average = " + average);

            if (average >= 75 && average <= 100) {
                System.out.println("Grade: Distinction");
            } else if (average >= 50) {
                System.out.println("Grade: Credit");
            } else if (average >= 0) {
                System.out.println("Grade: Fail");
            } else {
                System.out.println("Invalid marks.");
            }


            System.out.println();
        }

        input.close();
    }
}