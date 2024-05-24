import java.util.Scanner;

public class C3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in,"cp1251");
        System.out.println("Первая вершина: ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        System.out.println("Вторая вершина: ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        System.out.println("Третья вершина: ");
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();

        double A = lenSide(x1, y1, x2, y2);
        double B = lenSide(x1, y1, x3, y3);
        double C = lenSide(x2, y2, x3, y3);

        System.out.printf("Ответ: %.10f", A + B + C);
    }

    public static double lenSide(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }
}