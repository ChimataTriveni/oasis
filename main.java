import java.util.ArrayList;
import java.util.Scanner;

class main {
    static long curamount = 10000;
    static ArrayList<String> transactions = new ArrayList<>();

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String username = "hi";
        String userpin = "123";
        System.out.println("Enter username ");
        String name = sc.nextLine();
	System.out.println("Enter pin ");
        String pin = sc.nextLine();
        if (username.equals(name) && userpin.equals(pin)) {
            System.out.println("Welcome Mr " + name);
            while (true) {

                System.out.println("What would you like to do");
                System.out.println("1.Transaction History");
                System.out.println("2.Deposit");
                System.out.println("3.Withdraw");
                System.out.println("4.Tranfer");
                System.out.println("5.Quit");
                System.out.println("Enter your choice");
                int opt = sc.nextInt();
                if(opt==1){

                        transactionhistory();
                        }
                else if(opt==2){
                        System.out.println("Enter money to deposit");
                        long money = sc.nextLong();
                        deposit(money);

                      }
                else if(opt==3){
                        System.out.println("Enter money to withdraw");
                        long withdrawamount = sc.nextLong();
                        withdraw(withdrawamount);
                       }
                else if(opt==4){
                        System.out.println("Enter id");
                        String id = sc.next();
                        System.out.println("Enter amount");
                        long amount = sc.nextLong();
                        transfer(amount, id);
                       }
                else if(opt==5){
                        System.out.println("Exiting...");
                        return;
		}

                else{
                        System.out.println("Wrong choice");
                        break;

                }
            }
        } else {
            System.out.println("Invalid username and pin");
        }
    }

    public static void transactionhistory() {
        for (int i = 0; i < transactions.size(); i++) {
            System.out.println(transactions.get(i));
        }
        System.out.println();
        return;
    }

    public static void deposit(long money) {
        curamount += money;
        transactions.add("Deposit :" + money);
        System.out.println("Deposit Successful and current balance" + " " + curamount);
        System.out.println();
        return;
    }

    public static void withdraw(long money) {
        if (curamount >= money) {
            curamount -= money;
            transactions.add("Withdraw :" + money);
            System.out.println("Withdraw Successful and current balance" + " " + curamount);
            System.out.println();
            return;
        } else {
            System.out.println("Insufficient balance");
            System.out.println();
        }
    }

    public static void transfer(long money, String id) {
        if (curamount >= money) {
            curamount -= money;
            transactions.add("Transfered to " + id + ":" + money);
            System.out.println("Transfer Successful and current balance" + " " + curamount);
            System.out.println();
            return;
        } else {
            System.out.println("Insufficient balance");
            System.out.println();
        }
        return;
    }
}
