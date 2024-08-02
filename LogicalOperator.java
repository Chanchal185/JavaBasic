import java.util.Scanner;

public class LogicalOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean x = sc.nextBoolean();
        boolean y = sc.nextBoolean();
        System.out.println("AND:"+(x&&y));
        System.out.println("OR:"+(x||y));
        System.out.println("NOT:"+!x);
        sc.close();
    }
}
