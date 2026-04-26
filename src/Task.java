import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите собственную длину (в метрах): ");
        double l0 = scanner.nextDouble();
        System.out.print("Введите скорость: ");
        String uScan = scanner.next();

        double u = parse(uScan.endsWith("c") ? uScan.substring(0, uScan.length() - 1) : uScan);
        double c = 3 * Math.pow(10, -8);

        double l = l0 * (Math.sqrt(1 - (Math.pow(u * c, 2) / Math.pow(c, 2))));
        System.out.printf("\nL движущегося объекта (в метрах) = %.2f", l);
        System.out.printf("\nКоэффициент сокращения L0/L = %.2f", l0/l);

        scanner.close();
    }

    private static double parse(String value) {
        return Double.parseDouble(value.replace(',', '.'));
    }
}
