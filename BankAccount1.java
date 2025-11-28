public class BankAccount1 {
    private String owner;
    private double balance;

   
    public BankAccount1(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Внесени са " + amount + " лв.");
    }

  
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Изтеглихте " + amount + " лв.");
        } else {
            System.out.println("Грешка: недостатъчна наличност!");
        }
    }

    public void printBalance() {
        System.out.println("Текущ баланс: " + balance + " лв.");
    }

    public static void main(String[] args) {

        BankAccount1 acc = new BankAccount1("Ivan Ivanov", 100.00);

        acc.printBalance();

        acc.withdraw(40);
        acc.printBalance();

        acc.withdraw(100);
        acc.printBalance();

        acc.deposit(50);
        acc.printBalance();
    }
}
