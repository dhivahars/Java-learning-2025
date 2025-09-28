package Projects.bankAccountSimulation;

import java.util.*;
public class Ui {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BankAccount ba=new BankAccount();
        boolean flag=true;
        do{
            System.out.println("\n\nChoose a Option");
            System.out.println("1.Check Balance\n2.withdraw\n3.deposit\n4.Exit");
            int option=sc.nextInt();
            switch(option){
                case 1:{
                    System.out.print("Enter Account Number:");
                    int userac=sc.nextInt();
                    System.out.print("Enter Mpin:");
                    int uMpin=sc.nextInt();
                    if(userac==ba.getAccountNumber()){
                        if(uMpin==ba.getPin()){
                            System.out.println("your Balance is:"+ba.getBalance());
                        }
                        else {
                            System.out.println("Wrong Mpin");
                        }
                    }
                    else {
                        System.out.println("Account Not Found");
                    }
                    break;
                }
                case 2:{
                    System.out.print("Enter Your Account Number:");
                    long userac=sc.nextLong();
                    if(ba.getAccountNumber()==userac){
                        System.out.print("Enter Mpin:");
                        int uMpin=sc.nextInt();
                        if(uMpin==ba.getPin()){
                            System.out.print("Enter amount to Withdraw:");
                            double wAmount = sc.nextDouble();
                            if (wAmount > 0) {
                                if (wAmount <= ba.getBalance()) {
                                    ba.withDraw(wAmount);
                                    System.out.println("************Transaction Succesfull************");
                                    System.out.println("\n\nDo You Like To Display Your Balance\n 1.Yes\n 2.No");
                                    int yrn = sc.nextInt();
                                    System.out.println(yrn == 1 ? ba.getBalance() : "Thank you");

                                } else {
                                    System.out.println("Insufficient Balance");

                                }
                            } else {
                                System.out.println("Amount must be Greater Than Zero");
                            }

                        }
                    else {
                            System.out.println("Wrong Pin");
                        }}
                    else{
                        System.out.println("Account Does not exists");
                        }
                    break;}
                case 3:{
                    System.out.print("Enter Your Account Number:");
                    long userac=sc.nextLong();
                    if(ba.getAccountNumber()==userac){
                        System.out.print("Enter Mpin:");
                        int uMpin=sc.nextInt();
                        if(uMpin==ba.getPin()){
                            System.out.print("Enter amount to Deposit:");
                            double wAmount = sc.nextDouble();
                            if (wAmount > 0) {
                                    ba.deposit(wAmount);
                                    System.out.println("************Transaction Succesfull************");
                                    System.out.println("\n\nDo You Like To Display Your Balance\n 1.Yes\n 2.No");
                                    int yrn = sc.nextInt();
                                    System.out.println(yrn == 1 ? ba.getBalance() : "Thank you");

                            } else {
                                System.out.println("Enter a Valid amount");
                            }

                        }
                        else {
                            System.out.println("Wrong Pin");
                        }}
                    else{
                        System.out.println("Account Does not exists");
                    }
                    break;}
                case 4:{
                    System.out.println("Thank You");
                    flag=false;
                    break;}
                default:{
                    System.out.println("Wrong option Kindly Choose from the given Options");
                }
            }
        }
        while(flag);
    }
}