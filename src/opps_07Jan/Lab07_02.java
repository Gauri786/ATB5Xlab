package src.opps_07Jan;

public class Lab07_02 {
    public static void main (String [] args){

        BankAccount sbi = new BankAccount();
        sbi.printDetails();

        BankAccount HDFC = new BankAccount("HDFC", "HDFC002");
        HDFC.printDetails();

        BankAccount icici = new BankAccount("icici","icici002");
        icici.printDetails();


    }
}
