import java.util.Scanner;
public class Task127 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        while (true){
            String str = sc.nextLine();
            if (str.equals("ENTER")){
                System.out.println(a);
                break;
            }
            a = Integer.parseInt(str) + a;
        }
    }
}
