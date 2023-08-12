// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.io.*;
import java.util.*;
public class Main {
    public static void displayBalance(int balance)
    {
        System.out.println("Current Balance : " + balance);
        System.out.println();
    }

    // Withdraw amount and update the balance
    public static int amountWithdrawing(int balance,int withdrawAmount)
    {
        System.out.println("Withdrawn Operation:");
        System.out.println("Withdrawing Amount : "+ withdrawAmount);
        if (balance >= withdrawAmount) {
            balance = balance - withdrawAmount;
            System.out.println("Please collect your money and collect the card");
            displayBalance(balance);
        }
        else {
            System.out.println("Sorry! Insufficient Funds");
            System.out.println();
        }
        return balance;
    }

    // Deposit amount and update the balance
    public static int amountDepositing(int balance,int depositAmount)
    {
        System.out.println("Deposit Operation:");
        System.out.println("Depositing Amount : "+ depositAmount);
        balance = balance + depositAmount;
        System.out.println( "Your Money has been successfully deposited");
        displayBalance(balance);
        return balance;
    }
    public static void input(int balance){
        Scanner sc = new Scanner(System.in);
        System.out.println("Choices are: ");
        System.out.println("1)display balance");
        System.out.println("2)Withdraw");
        System.out.println("3)Deposit");
        System.out.println("4)ExiT");
        System.out.println("Enter your choice:");
        int choice = sc.nextInt();
        switch(choice){
            case 1:
                displayBalance(balance);
                input(balance);
                break;
            case 2:
                System.out.println("Enter withdraw amount:");
                int withdrawAmount=sc.nextInt();
                balance=amountWithdrawing(balance, withdrawAmount);
                input(balance);
                break;

            case 3:
                System.out.println("Enter deposit amount:");
                int depositAmount=sc.nextInt();
                balance=amountDepositing(balance, depositAmount);
                input(balance);
                break;
            case 4:
                System.out.println("Thank you for using ATM, bye.");
                break;
            default:
                System.out.println("Invalid input!!");
                input(balance);
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter balance amount:");
        int bal=sc.nextInt();
        input(bal);
    }
}