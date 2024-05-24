import java.util.Scanner;

public class C2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in,"cp1251");
        int num = sc.nextInt();
        int i = 2;
        while (num % i != 0) {
            i++;
        }
        System.out.println(i);
    }
}
