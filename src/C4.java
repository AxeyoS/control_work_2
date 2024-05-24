import java.util.Scanner;

public class C4 {
    public static int factorial(int n){
        int result=1;
        for (int i = 1; i <= n; i++)
        {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in,"cp1251");
        System.out.println("Введите число n: ");
        int n = sc.nextInt();
        System.out.println("Факториал числа "+ n + ": " + factorial(n));
    }
}
