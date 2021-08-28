package solid;

class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.transferMoney(new BankAccount(),100);
        BankAccount target = new InterBankAccount();
        bankAccount.transferMoney(target, 100);

    }
}

enum AccountType {
    Thailand,
    Inernational
}

public class BankAccount {
    AccountType type = AccountType.Thailand;

    void transferMoney(BankAccount targetAccount, int amount) {
        //tranfer moner process
        System.out.println("Transfer money in Thailand");
    }
}

class InterBankAccount extends BankAccount {
    @Override
    void transferMoney(BankAccount targetAccount, int amount) {
        //tranfer moner process
        System.out.println("Transfer money in Inter");
    }
}
