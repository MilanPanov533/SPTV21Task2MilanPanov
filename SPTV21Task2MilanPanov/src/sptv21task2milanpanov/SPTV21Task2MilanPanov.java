package sptv21task2milanpanov;
import java.util.Scanner;
public class JavaApplication38 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("Введите трехзначное число - ");
       int n = input.nextInt();
       System.out.println("Сумма - "+sum(n));
    }
    public static int sum(int n){
        int sum = 0;
        while (n !=0){
            sum +=n%10;
            n/=10;
        }
        return sum;
    }
    
}
