import java.util.Scanner;

public class AssignmentOperatorInJava {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("a += 3:"+(a+=3));
        System.out.println("a -= 2:"+(a-=2));
        System.out.println("a *= 2:"+(a*=2));
        System.out.println("a /= 2:"+(a/=2));
        System.out.println("a %= 2:"+(a%=2));
        System.err.println(a);
        sc.close();
        // change in a variable

    }
}
