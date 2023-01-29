package chapter14;

public class BankAccounts {
    String accountNumber;
    int balance;

    public String toString() {
        return "¥¥" + this.balance + "(口座番号： + this.accountNumber)";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof BankAccounts) {
            BankAccounts bankAccounts = (BankAccounts) o;
            String an1 = this.accountNumber.trim();
            String an2 = bankAccounts.accountNumber.trim();
            if (an1.equals(an2)) {
                return true;
            }
        }
        return false;
    }
}
