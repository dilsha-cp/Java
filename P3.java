import java.util.Scanner;

public class P3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d=scan.nextDouble();
        scan.nextLine();
        String s=scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
// There are three lines of output:

// On the first line, print String: followed by the unaltered String read from stdin.
// On the second line, print Double: followed by the unaltered double read from stdin.
// On the third line, print Int: followed by the unaltered integer read from stdin.