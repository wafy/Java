public class BankAccount {
    private int balance;
    private Person owner;

    public BankAccount(int balance) {
        if (balance < 0) {
            this.balance = 0;
        } else {
            this.balance = balance;
        }
    }

    public BankAccount(Person owner) {
        //owner = newOwner;
        balance = 0;
        this.owner = owner;

    }

    public BankAccount(int balance, Person owner) {
        this.owner = owner;
        if (balance < 0) {
            this.balance = 0;
        } else {
            this.balance = balance;
        }
    }


    public void setOwner(Person owner) {
        this.owner = owner;
}

    public Person getOwner() {
        return owner;
    }


    public void setBalance(int balance) {
        if (balance > 0) {
            this.balance = balance;
        }
    }

    public int getBalance() {
        return balance;
    }

    // 파라미터 : 입금할 액수(정수)
    // 리턴 : 성공여부(불린)

    boolean deposit(int amount) {
        if (amount >= 0 && amount <= owner.getCashAmount()) {
            owner.setCashAmount(owner.getCashAmount() - amount);
            setBalance(getBalance() + amount);
            System.out.printf("%d원 입금하였습니다. 잔고: %d원, 현금: %d원\n", amount, getBalance(), owner.getCashAmount());
            return true;
        } else {
            System.out.printf("입금 실패입니다. 잔고: %d원, 현금: %d원\n", getBalance(), owner.getCashAmount());
            return false;
        }
    }

    // 파라미터 : 출금할 액수(정수)
    // 리턴 : 성공여부(불린)
    boolean withdraw(int amount) {
        if (amount >= 0 && amount <= getBalance()) {
            setBalance(getBalance() - amount);
            owner.setCashAmount(owner.getCashAmount() + amount);
            System.out.printf("%d원 출금하였습니다. 잔고: %d원, 현금: %d원\n", amount, getBalance(), owner.getCashAmount());
            return true;
        } else {
            System.out.printf("출금 실패입니다. 잔고: %d원, 현금: %d원\n", getBalance(), owner.getCashAmount());
            return false;
        }
    }

    // 첫 번째 파라미터: 받는 사람의 계정 (BankAccount)
    // 두 번째 파라미터: 이체할 금액 (정수)
    // 리턴 : 성공여부 (불린)
    public boolean transfer(BankAccount to, int amount) {
        boolean success;
        if (amount > 0 && amount <= getBalance()) {
            success = true;
            setBalance(getBalance() - amount);
            to.setBalance(to.getBalance() + amount);
            System.out.println(success + " - from: " + owner.getName() + ", to: " + to.owner.getName() + ", amount: " + amount + ", balance: " + getBalance());
        } else {
            success = false;
            System.out.println(success + " - from: "+ owner.getName() + ", to: " + to.owner.getName() + ", amount: " + amount + ", balance: " + getBalance());
        }

        return success;
    }

    // 첫 번째 파라미터: 받는 사람 (Person)
    // 두 번째 파라미터: 이체할 금액 (정수)
    // 리턴 : 성공여부 (불린)
    public boolean transfer(Person to, int amount) {
//        return transfer(to.getAccount(), amount);
        return owner.transfer(to, amount);

    }
}