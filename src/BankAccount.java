public interface BankAccount {
//    withdraw money
//    add money
//    check balance
//    get ROI
//    calculate interest
    boolean withDrawMoney(int money);
    boolean addMoney(int money);
    int checkBalance();
    int getROI();
    int getTotalInterest(int time, int amount);
}
