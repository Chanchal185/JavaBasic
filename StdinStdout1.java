import java.util.Scanner;
public class StdinStdout1 {
    public static void main(String[] args) {
        // 42,100,125
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        //for(int i=0; i<3; i++){
        //  int value = scnextInt();
        //}
        sc.close();
    }
}
