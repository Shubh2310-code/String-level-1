import java.util.Scanner;

public class Initials
{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name of 3 or more words:");
        String rbi = sc.nextLine();
        int len = rbi.length();

        System.out.print(rbi.charAt(0) + " ");
        for (int i = 1; i < len; i++) {
            char ch = rbi.charAt(i);
            if (ch == ' ') {
                char ch2 = rbi.charAt(i + 1);
                System.out.print(ch2 + " ");
            }
        }
    }
}
