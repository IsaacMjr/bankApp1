import java.util.UUID;

public class HDFCBankAccount implements BankAccount{
    private int roi;
    private int balance;
    private String accountNumber;

    public HDFCBankAccount(int balance) {
        this.balance = balance;
        this.roi =5;
        this.accountNumber = String.valueOf(UUID.randomUUID());
    }

    public HDFCBankAccount(int roi, int balance){
        this.balance = balance;
        this.roi = roi;
    }

//    adding getters and setters

    public void setRoi(int roi){
        this.roi = roi;
    }
    public int getRoi() {
        return roi;
    }

    public void setBalance(int balance){
        this.balance = balance;
    }
    public int getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    @Override
    public boolean withDrawMoney(int money) {
        if(this.balance > money){
            this.balance -=money;
            return true;
        }
        return false;
    }

    @Override
    public boolean addMoney(int money){
        this.balance+=money;
        return true;
    }

    @Override
    public int checkBalance(){
        return this.balance;
    }

    @Override
    public int getROI(){
        return this.roi;
    }

    @Override
    public int getTotalInterest(int time, int amount){
        return amount* time *(roi/100);
    }
}
