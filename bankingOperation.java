package banking;

import java.util.Scanner;

public class bankingOperation {
    String Cname,Cid;
    double Balance = 0.00;
    Scanner Scn = new Scanner(System.in);
    bankingOperation(String cname, String cid){
        this.Cname = cname;
        this.Cid = cid;
    }

    double getamount(){
        double amount;
        System.out.println("Enter an amount");
        amount = Scn.nextDouble();
        return amount;
    }

    void deposit(double amount){
        
        if(amount!=0){
            Balance = amount;
            System.out.println("Amount Deposited Successfully");
        }
        else{
            System.out.println("!!!!Error: Amount cannot be either zero or negative");
        }
    }
    
    void withdraw(double amount){
        
    }

    void menu(){
        int choice;
        System.out.println("Welcome to the Bank, "+Cname);
        System.out.println("Customer ID: "+Cid);
        System.out.println("\n\n\n\n------Main Menu------");
        System.out.println("/n/n1.Deposit");
        System.out.println("2.Withdraw");
        System.out.println("3.Show Balance");
        System.out.println("4.Last Transaction");
        System.out.println("5.Exit");
        do{
            System.out.println("/n/nEnter an Option to continue....");
            choice = Scn.nextInt();
            switch(choice){
                case 1:{
                    double depositAmount;
                    depositAmount = getamount();
                    deposit(depositAmount);
                    break;
                }
                case 2:{
                    double withdrawAmount;
                    withdrawAmount = getamount();
                    withdraw(withdrawAmount);
                    break;
                }
                case 3:{
                    balance();
                    break;
                }
                case 4:{
                    lastTransaction();
                    break;
                }
                default:{
                    System.out.println("Error: Invalid Option is pressed");
                    System.out.println("Please provide an Valid option");
                }
            }
        }while(choice!=5);
    }

}