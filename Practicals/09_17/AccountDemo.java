class Account {
    private int mBalance = 50;

    public int getBalance() {
        return mBalance;
    }
    
    public void withdrawAmmount(int ammount) {
        mBalance -= ammount;
    }
}

public class AccountDemo implements Runnable {

    private Account account = new Account();
    
    public static void main(String[] args) {
        AccountDemo obj = new AccountDemo();
        new Thread(obj, "Fred").start();
        new Thread(obj, "Lucy").start();  
    }

    @Override
    public void run() {
        for(int i = 0; i < 5; i++) {
            makeWithdraw(10);
            if(account.getBalance() < 0) System.out.println("Not enough money...");
        }
    }

    public synchronized void makeWithdraw(int ammount) {
        if (account.getBalance() >= ammount) {
            System.out.println(Thread.currentThread().getName() + " wants to withdrawn " + ammount);

            try {
                Thread.sleep(500);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            account.withdrawAmmount(ammount);
            System.out.println(Thread.currentThread().getName() + " has withdrawn " + ammount);
        } else {
            System.out.println("Not enough money for " + 
                Thread.currentThread().getName() + " tried to withdraw " + account.getBalance());
        }
    }
}