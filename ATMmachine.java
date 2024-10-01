import java.util.Scanner;

class ATM {
  float balance;
  int PIN = 3452;

  public void cheackPin() {
    Scanner sc = new Scanner(System.in);
    int enteredPin = sc.nextInt();
    if (enteredPin == PIN) {
      menu();
    } else {
      System.out.println("Enter a Valid Pin");
    }
  }

  public void menu() {
    System.out.println("Enter your choice:");
    System.out.println("1. cheack balance");
    System.out.println("2.Withdrawl");
    System.out.println("3.Deposit money");
    System.out.println("4.Exit");

    Scanner sc = new Scanner(System.in);
    int opt = sc.nextInt();
    if (opt == 1) {
      checkBalance();
    } else if (opt == 2) {
      withDrawlMoney();
    } else if (opt == 3) {
      depositMoney();
    } else if (opt == 4) {
      return;
    } else {
      System.out.println("Enter valid choice");
    }
  }

  public void checkBalance() {
    System.out.println("Balance:" + balance);
    menu();
  }
  public void withDrawlMoney() {
    System.out.println("Enter Amount Withdrawl:");
    Scanner sc = new Scanner(System.in);
    float amount = sc.nextFloat();
    if (amount > balance) {
      System.out.println("insuuficient balance");
    } else {
      balance = balance - amount;
      System.out.println("Money Withdrawl succesfully");
    }
    menu();
  }

  public void depositMoney() {
    System.out.println(" Enter your Amount:");
    Scanner sc = new Scanner(System.in);
    float amount = sc.nextFloat();
    balance = balance + amount;
    System.out.println("money Deposit succesfully");
    menu();
  }
}

public class ATMmachine {

  public static void main(String[] args) {
    ATM at=new ATM();
    at.cheackPin();
  } 
  
}
