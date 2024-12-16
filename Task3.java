import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temperature = sc.nextDouble();
        if (temperature > 38.0) {
            System.out.println("High temperature");
        } else if (temperature < 36.0) {
            System.out.println("Low temperature");
        } else {
            System.out.println("Normal temperature");
        }
    }
}
