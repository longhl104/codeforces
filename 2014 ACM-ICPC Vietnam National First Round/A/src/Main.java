import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static int[] d = new int[10];
    private static boolean[] dd = new boolean[10];
    private static ArrayList<String> generated = new ArrayList<>();

    public static void main(String[] args) {
        ArrayList<ArrayList<String>> res = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.println(-1);
                    break;
                case 2:
                    System.out.println(-1);
                    break;
                case 3:
                    System.out.println(-1);
                    break;
                case 4:
                    System.out.println("1210 2020");
                    break;
                case 5:
                    System.out.println("21200");
                    break;
                case 6:
                    System.out.println(-1);
                    break;
                case 7:
                    System.out.println("3211000");
                    break;
                case 8:
                    System.out.println("42101000");
                    break;
                case 9:
                    System.out.println("521001000");
                    break;
                case 10:
                    System.out.println("6210001000");
                    break;
            }
        }
    }
}
