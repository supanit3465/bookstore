package solid;

class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.transferMoney(new BankAccount(),100);
    }
}

public class BankAccount {
    void transferMoney(BankAccount targetAccount, int amount) {
        //tranfer moner process

    }
}