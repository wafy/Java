public class Person {
    //객체의 속성 담당
    private String name;
    private int age;
    private int cashAmount; // 현금 보유량
    private BankAccount account;

    public Person(String name, int age) {

        this.name = name;
//        cashAmount = 0; 정수형의 기본값은 0 이기에 쓰지 않아도 된다.

        if (age < 0) {
            this.age = 12;
        } else {
            this.age = age;

        }

    }

    public Person(String name, int age, int cashAmount) {

        this.name = name;

        if(age < 0) {
            this.age = 12;
        } else {
            this.age = age;
        }

        if(cashAmount < 0) {
            this.cashAmount = 0;
        } else {
            this.cashAmount = cashAmount;
        }


    }


    public void setAccount(BankAccount account) {
        this.account = account;
    }

    public BankAccount getAccount() {
        return account;
    }

    public void setAge(int age) {
        if (this.age > 0) {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getName() {

        return name;
    }

    public void setCashAmount(int cashAmount) {
        if (cashAmount > 0) {
            this.cashAmount = cashAmount;
        }
    }

    public int getCashAmount() {
        return cashAmount;
    }


    // 첫 번째 파라미터: 받는 사람 (Person)
    // 두 번째 파라미터: 이체할 금액 (정수)
    // 리턴 : 성공여부 (불린)
    public boolean transfer(Person to, int amount) {
        boolean success;
        if (amount > 0 && amount <= account.getBalance()) {
            success = true;
            account.setBalance(account.getBalance() - amount);
            to.account.setBalance(to.account.getBalance() + amount);
            System.out.println(success + " - from: " + getName() + ", to: " + to.getName() + ", amount: " + amount + ", balance: " + account.getBalance());
        } else {
            success = false;
            System.out.println(success + " - from: " + getName() + ", to: " + to.getName() + ", amount: " + amount + ", balance: " + account.getBalance());
        }

        return success;
    }

    // 첫 번째 파라미터: 받는 사람의  계정 (BankAccount)
    // 두 번째 파라미터: 이체할 금액 (정수)
    // 리턴 : 성공여부 (불린)
    public boolean transfer(BankAccount to, int amount) {
//        return transfer(to.getOwner(), amount);
        return account.transfer(to, amount);
    }
}

