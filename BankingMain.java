import java.util.Scanner;
import banking.bankingOperation;

public class BankingMain {
    public static void main(String args[]){
        String Cname, Cid;
        Scanner Scn = new Scanner(System.in);
        System.out.println("Enter Your Name:");
        Cname = Scn.next();
        System.out.println("Enter Your Banking ID:");
        Cid = Scn.next();
        bankingOperation bnkOpn = new bankingOperation(Cname, Cid);
        bnkOpn.menu();
    }
}
