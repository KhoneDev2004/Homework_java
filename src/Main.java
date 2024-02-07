import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sw = new Scanner(System.in);
        System.out.print("Enter your Grade : ");
        int score = sw.nextInt();
        String Grade;
        if (score >= 91 && score <= 100) {
            Grade = "A";
        } else if (score >= 81 && score <= 90) {
            Grade = "B+";
        } else if (score >= 70 && score <= 80) {
            Grade = "B";
        } else if (score >= 65 && score <= 69) {
            Grade = "C+";
        } else if (score >= 60 && score <= 64) {
            Grade = "C";
        } else if (score >= 55 && score <= 59) {
            Grade = "D+";
        } else if (score >= 50 && score <= 54) {
            Grade = "D";
        } else if (score >= 0 && score <= 49) {
            Grade = "F";
        } else {
            Grade = "Number not found";
        }
        System.out.println("This is Grade : " + Grade);
    }
}