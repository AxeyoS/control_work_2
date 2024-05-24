import java.util.Scanner;

public class C1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in,"cp1251");

        System.out.println("Является ли год с данным номером високосным?");
        int g = sc.nextInt();
        if (g % 4 == 0) {
            if ((g % 100 != 0) || (g % 400 == 0)) {
                System.out.println("YES");
            }
        }
        else System.out.println("NO");
    }
}
