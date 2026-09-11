import java.util.Scanner;

public class IT26101914Lab7Q1A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sub1, sub2, sub3, sub4;
        double average;

        System.out.print("Enter marks for Subject 1: ");
        sub1 = input.nextInt();

        System.out.print("Enter marks for Subject 2: ");
        sub2 = input.nextInt();

        System.out.print("Enter marks for Subject 3: ");
        sub3 = input.nextInt();

        System.out.print("Enter marks for Subject 4: ");
        sub4 = input.nextInt();
		
		average = (sub1 + sub2 + sub3 + sub4) / 4.0;

        System.out.println("Average = " + average);

        if (average >= 75 && average <= 100) {
            System.out.println("Grade: Distinction");
        } else if (average >= 50 && average <= 74) {
            System.out.println("Grade: Credit");
        } else if (average >= 0 && average <= 49) {
            System.out.println("Grade: Fail");
        } else {
            System.out.println("Invalid marks.");
        }

        input.close();
    }
}