package DAY_1_BASICS;

import java.util.*;

public class ATM_MACHINE_SIMULATOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the PIN : ");
        int pin = sc.nextInt();
        int original_pin = 1234;
        if (original_pin == pin) {

            int choice = 1;
            int balance = 10000;
            while (choice != 0) {
                System.out.println(
                        "Enter the choice:\n1. Check Balance \n2. Withdraw Money \n3. Deposit Money \n4. Exit");
                choice = sc.nextInt();
                if (choice == 1) {
                    System.out.println("The Balance is: " + balance);
                } else if (choice == 2) {
                    System.out.println("Enter the amount to withdraw: ");
                    int amt = sc.nextInt();
                    if (amt <= balance && (amt % 100 == 0)) {
                        System.out.println("Withdraw Successful");
                        balance = balance - amt;
                    } else {
                        System.out.println("Please Enter a Valid amount");
                    }
                } else if (choice == 3) {
                    System.out.println("Enter the amount to Deposit:");
                    int amt = sc.nextInt();
                    if (amt < 40000 && (amt % 100 == 0)) {
                        balance = balance + amt;
                        System.out.println("Deposit Successful");
                    } else {
                        System.out.println("Please Enter a Valid amount");
                    }
                } else if (choice == 4) {
                    System.out.println("Thank you");
                    break;
                } else {
                    System.out.println("Please Enter valid option");
                }
                System.out.println("\n");
            }

        } else {
            System.out.println("Please enter the valid pin");
        }
    }

}
