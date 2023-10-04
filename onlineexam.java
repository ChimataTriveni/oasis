import java.util.Scanner;

class onlineexam {
    private String name; 
    private String pin;  
    private Scanner input = new Scanner(System.in);

    public void login() {
        System.out.println("\n********** Welcome to ONLINE EXAM SYSTEM **********\n");
        System.out.println("Enter username: ");
        name = input.nextLine();
        System.out.println("Enter pin: ");
        pin = input.nextLine();

        if ("hi".equals(name) && "12345".equals(pin)) {
            main();
        } else {
            System.out.println("Invalid!! Please Check...");
            login();
        }
    }

    public void main() {
        System.out.println("\n1.Update\n2.Start test\n3.Logout");
        System.out.println("Enter your choice: ");
        int opt = input.nextInt();
        if (opt == 1) {
            update();
            main();
        } else if (opt == 2) {
            solve();
            main();
        } else if (opt == 3) {
            System.exit(0);
        } else {
            System.out.println("Invalid Choice!");
        }
    }

    public void update() {
        System.out.println("\n----- Update -----");
        if ("hi".equals(name) && "123".equals(pin)) {
            // If they match, prompt the user for new values
            System.out.println("Enter new username: ");
            name = input.next();
            System.out.println("Enter new password: ");
            pin = input.next();
            System.out.println("Username and password updated successfully!");
        } else {
            System.out.println("Invalid username or password. Update failed.");
        }
    }

    public void solve() {
        long start = System.currentTimeMillis();
        long terminate = start + 60 * 1000;
        int score = 0;
        int c = 0, w = 0;
        char ans;
        System.out.println("\n\n***** Starting The Test *****");
        System.out.println("\nYou have 1 Minute to answer each question. Select the options wisely... ");
        System.out.println("\nEach question gives +5 marks for a correct answer and -1 mark for a wrong answer.");
        System.out.println("\nAll the very best!!");

        while (System.currentTimeMillis() < terminate) {
            System.out.println("\nQ1. Which of the following is not a valid identifier in Java?");
            System.out.println("a. my_variable\nb. 123variable\nc. _variable\nd. variable123");
            System.out.println("Answer:");
            ans = input.next().charAt(0);
            if (ans == 'b') {
                c += 1;
            } else {
                w -= 1;
            }

            System.out.println("\nQ2. In Java, what is the result of dividing an integer by zero?");
            System.out.println("a. It is not allowed; it will result in a compilation error.");
            System.out.println("b. It will throw a runtime exception.");
            System.out.println("c. It will result in infinity.");
            System.out.println("d. It will result in zero.");
            System.out.println("Answer:");
            ans = input.next().charAt(0);
            if (ans == 'b') {
                c += 1;
            } else {
                w -= 1;
            }

            System.out.println("\nQ3. Which keyword is used to define a constant in Java?");
            System.out.println("a. static\nb. constant\nc. final\nd. const");
            System.out.println("Answer:");
            ans = input.next().charAt(0);
            if (ans == 'c') {
                c += 1;
            } else {
                w -= 1;
            }

            System.out.println("\nQ4. Which Java access modifier is the most restrictive?");
            System.out.println("a. public\nb. protected\nc. private\nd. default (package-private)");
            System.out.println("Answer:");
            ans = input.next().charAt(0);
            if (ans == 'c') {
                c += 1;
            } else {
                w -= 1;
            }

            System.out.println("\nQ5. What is the result of 10 % 3 in Java?");
            System.out.println("a. 0\nb. 1\nc. 2\nd. 3");
            System.out.println("Answer:");
            ans = input.next().charAt(0);
            if (ans == 'b') {
                c += 1;
            } else {
                w -= 1;
            }
            break;
        }

        System.out.println("Test Completed!");
        score = ((c * 5) + w);
        System.out.println("Number of correct answers: " + c);
        System.out.println("Congratulations!! Your score is " + score + ".");
    }

    public static void main(String args[]) {
        onlineexam e = new onlineexam();
        e.login();
    }
}
