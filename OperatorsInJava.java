import java.util.Scanner;
public class ArithmeticOperatorInJava {
    public static void main(String[] args) {
        // using Airthmatic operator
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("sum="+sum);
        int sub = a-b;
        System.out.println("sub="+sub);
        int mul = a*b;
        System.out.println("mul="+mul);
        float div = a/b;
        System.out.println("div="+div);
        int mod = a%b;
        System.out.println("mod="+mod);
        
        sc.close();
    }
}
