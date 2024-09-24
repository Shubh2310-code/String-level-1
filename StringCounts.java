import java.util.Scanner;

public class StringCounts
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String str = in.nextLine();

        int len = str.length();

        int uc = 0;
        int lc = 0;
        int sc = 0;
        int dc = 0;
        char ch;

        for (int i = 0; i < len; i++) {
            ch = str.charAt(i);
            if (Character.isUpperCase(ch))
                uc++;
            else if (Character.isLowerCase(ch))
                lc++;
            else if (Character.isDigit(ch))
                dc++;
            else if (!Character.isWhitespace(ch))
                sc++;
        }

        System.out.println("UpperCase Count = " + uc);
        System.out.println("LowerCase Count = " + lc);
        System.out.println("Digit count = " + dc);
        System.out.println("Special Character Count = " + sc);

    }
}
