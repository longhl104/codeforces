import java.awt.Point;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    public static int n;
    public static ArrayList<Point> p = new ArrayList<Point>();
    public static ArrayList<Point> q = new ArrayList<Point>();

    //    public static int xMul(Point a, Point b) {
//        return a.x * b.y - a.y * b.x;
//    }
//    public static int turn(Point a, Point b, Point c) {
//        Point ab = Point(b.x-a.x,b.y-a.y);
//        Point bc = Point(c.x-b.x,c.y-b.y);
//        if(xMul(ab,bc)==0)
//            return 0;
//        if(xMul(ab,bc)>0)
//
//    }
    public static int gcd(int a, int b) {
        while(b != 0) {
            int r = a % b;
            a = b; b = r;
        }
        return a;
    }

    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
//        File file = new File("input");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int x, y;
        double res = 0;
        for (int i = 1; i <= n; ++i) {
            x = sc.nextInt();
            y = sc.nextInt();
            p.add(new Point(x, y));
        }
        for (int i = 0; i < n; ++i) {
            if (i == 0) {
                res += (long)(p.get(n - 1).x - p.get(i + 1).x) * p.get(i).y;
            } else if (i == n - 1)
                res += (long)(p.get(i - 1).x - p.get(0).x) * p.get(i).y;
            else
                res += (long)(p.get(i - 1).x - p.get(i + 1).x) * p.get(i).y;
        }
        res = Math.abs(res) / 2;
        double cnt = 0;
        for (int i = 0; i < n; ++i) {
            Point a = p.get(i);
            Point b;
            if (i == n - 1)
                b = p.get(0);
            else
                b = p.get(i + 1);
            cnt += gcd(Math.abs(a.x - b.x), Math.abs(a.y - b.y));
        }

        System.out.println((long)(res-cnt/2+1));
    }

}

