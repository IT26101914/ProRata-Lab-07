import java.util.Scanner;

public class IT26101914Lab7Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.println("Customer " + i);

            System.out.print("Enter Total Bill Amount: ");
            double bill = input.nextDouble();

            System.out.print("Enter Payment Mode (C/c for Cash, O/o for Other): ");
            char mode = input.next().charAt(0);

            double discount = 0;
            double amountToPay = bill;

            if (mode == 'C' || mode == 'c') {
                discount = bill * 0.05;
                amountToPay = bill - discount;

                System.out.println("Discount = Rs. " + discount);
                System.out.println("Amount to Pay = Rs. " + amountToPay);
            } else if (mode == 'O' || mode == 'o') {
                System.out.println("Discount = Rs. 0.0");
                System.out.println("Amount to Pay = Rs. " + amountToPay);
            } else {
			System.out.println("Payment Mode is Not Valid");
            }

            System.out.println();
        }

        input.close();
    }
}