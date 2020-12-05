package banking;

import java.util.Scanner;

public class bankingOperation {
    String Cname,Cid;
    double Balance = 0.00;
    Scanner Scn = new Scanner(System.in);
    public bankingOperation(String cname, String cid){
        this.Cname = cname;
        this.Cid = cid;
    }

    double getamount (){
        double amount;
        System.out.println("Enter an amount");
        amount = Scn.nextDouble();
        return amount;
    }

    void deposit (double amnt){
        
        if (amnt!=0){
            Balance = Balance + amnt;
            System.out.println("Amount Deposited Successfully");
        }
        else{
            System.out.println("!!!!Error: Amount cannot be either zero or negative");
        }
    }
    
    void withdraw (double amnt){
        if (amnt!=0){
            Balance = Balance - amnt;
            System.out.println("Withdraw of amount "+amnt+" is successfull");
        }
        else{
            System.out.println("!!!!Error: Amount cannot be either zero or negative");
        }
    }

    void balance (){
        System.out.println("The Balance in your Account : "+Balance);
    }

    void lastTransaction(double value){
        if (value>0){
            System.out.println("Deposited : "+value);
        }
        else if (value<0){
            System.out.println("Withdrawn : "+Math.abs(value));
        }
        else{
            System.out.println("No operation has been performed on your Account!!");
        }
    } 

    public void menu(){
        int choice;
        double amount = 0.00;
        System.out.println("\n\n\nWelcome to the Bank, "+Cname);
        System.out.println("\nCustomer ID: "+Cid);
        System.out.println("\n\n\n\n------Main Menu------");
        System.out.println("\n\n1.Deposit");
        System.out.println("2.Withdraw");
        System.out.println("3.Show Balance");
        System.out.println("4.Last Transaction");
        System.out.println("5.Exit");
        do{
            System.out.println("\n\nEnter an Option to continue....");
            choice = Scn.nextInt();
            switch(choice){
                case 1:{
                    amount = getamount();
                    deposit(amount);
                    break;
                }
                case 2:{
                    amount = getamount();
                    withdraw(amount);
                    amount = -amount;
                    break;
                }
                case 3:{
                    balance();
                    break;
                }
                case 4:{
                    lastTransaction(amount);
                    break;
                }
                default:{
                    System.out.println("Error: Invalid Option is pressed");
                    System.out.println("\nPlease provide an Valid option");
                }
            }
        }while(choice!=5);
        System.out.println("Thanks for Banking with us!!");
        System.out.println("Have a wonderful day, "+Cid);
    }

}