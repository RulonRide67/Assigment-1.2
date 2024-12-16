import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a > 60 || a < 20) {
            System.out.println("you don't have to work");
        }
    }
}
