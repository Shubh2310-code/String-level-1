import java.util.Scanner;
public class ReadString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any word: ");
        String name = sc.next();
        System.out.println("My name is: "+name);
    }
}
