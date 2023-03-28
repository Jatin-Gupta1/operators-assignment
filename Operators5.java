import java.util.Scanner;
public class Operators5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int p = a ^ b;
        int count = 0;
        while (p!=0){
            p = p& (p - 1);
            count++;
        }
        System.out.print(count);
    }
}