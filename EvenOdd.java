import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        if((num<0)||(num>=Long.MAX_VALUE)){
            System.out.println("please pass the positive integer");
        }
        else if(num%2==0){
            System.out.println("This is Even number"+" "+num);
        }
        else{
            System.out.println("This is Odd number"+" "+num);
        }
        sc.close();
    }
}
