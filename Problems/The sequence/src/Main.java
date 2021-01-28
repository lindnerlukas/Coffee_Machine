import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        solve();
    }
    public static void solve() {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int max = 0;
        while (scanner.hasNext()) {
            int input = scanner.nextInt();
            if (input % 4 == 0 && input > max) {
                max = input;
            }
        }
        System.out.println(max);
    }
}