import java.util.Scanner;
public class StdinStdout2 {
    public static void main(String[] args) {
        // input 42,3.14, welcome to hackerrank tutorial !
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        double d = sc.nextDouble();
        int i = sc.nextInt();
        sc.nextLine();
        System.out.println("String:" +s);
        System.out.println("Double:" +d);
        System.out.println("Integer:" +i);
        sc.close();
    }
}
