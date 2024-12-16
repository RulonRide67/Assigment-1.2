public class Task8 {
    public static void main(String[] args) {
        int a = 1, b = 0;
        while (a <= 100) {
            if (a % 3 ==0) {
                a++;
            }
            b += a;
            a++;
        }
        System.out.println(b);
    }
}
