package src.opps_07Jan;

public class BankAccount {
    String bankName;
    int balance;

    String bankcode;

    BankAccount(){
        bankName = "SBI";
        bankcode = "sbi0001";
        System.out.println("Default C");
    }
    BankAccount(String bname, String bcode){
        this.bankName = bname;
        this.bankcode = bcode;
        System.out.println("Param C");
    }
    void printDetails(){
        System.out.println("Bank Name " +bankName);
        System.out.println("Bal "+balance);
        System.out.println("Bcode "+bankcode);
}
}