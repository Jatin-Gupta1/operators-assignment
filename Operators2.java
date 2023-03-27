import java.util.Scanner;
public class Operators2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number a");
        int x = sc.nextInt();
        System.out.println("Enter 2nd number b");
        int y = sc.nextInt();
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("after swapping");
        System.out.println("a="+x);
        System.out.println("b="+y);
    }
}