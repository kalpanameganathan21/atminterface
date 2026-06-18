import java.util.Scanner;

public class OnlineExaminationSystem {

    static String username = "admin";
    static String password = "1234";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== ONLINE EXAMINATION SYSTEM =====");

        System.out.print("Enter Username: ");
        String user = sc.nextLine();

        System.out.print("Enter Password: ");
        String pass = sc.nextLine();

        if (!user.equals(username) || !pass.equals(password)) {
            System.out.println("Invalid Login!");
            return;
        }

        int score = 0;

        System.out.println("\nExam Started!");

        System.out.println("1. Java is a?");
        System.out.println("a) Programming Language");
        System.out.println("b) Operating System");
        System.out.println("c) Browser");
        System.out.print("Answer: ");
        String q1 = sc.next();

        if (q1.equalsIgnoreCase("a"))
            score++;

        System.out.println("\n2. JVM stands for?");
        System.out.println("a) Java Virtual Machine");
        System.out.println("b) Java Variable Method");
        System.out.println("c) Joint Virtual Machine");
        System.out.print("Answer: ");
        String q2 = sc.next();

        if (q2.equalsIgnoreCase("a"))
            score++;

        System.out.println("\n3. Which keyword is used for inheritance?");
        System.out.println("a) this");
        System.out.println("b) extends");
        System.out.println("c) super");
        System.out.print("Answer: ");
        String q3 = sc.next();

        if (q3.equalsIgnoreCase("b"))
            score++;

        System.out.println("\n===== RESULT =====");
        System.out.println("Score: " + score + "/3");

        sc.close();
    }
}