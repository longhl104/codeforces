import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    static int a, b, n;
    static int[] l = new int[100001];
    static long[] f = new long[100001];

    public static int search(int n, long x) {
        int l = 1, r = n, mid;
        while (l < r) {
            mid = (l + r) / 2;
            if(f[mid] == x)
                return mid;
            if(f[mid]>x) {
                r=mid-1;
            } else {
                l = mid+1;
            }
        }
        if(f[l]>=x)
            return l;
        else
            return l+1;
    }

    public static void main(String[] args) throws FileNotFoundException {
        //Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(new File("input"));
        int t = sc.nextInt();
        for(int j=1;j<=t;++j) {
            a = sc.nextInt();
            b = sc.nextInt();
            n = sc.nextInt();
            int x=a;
            long y=b;
            f[0] = 0;
            for (int i = 1; i <= a; ++i) {
                l[i] = sc.nextInt();
                f[i] = f[i - 1] + l[i];
            }
            while((n--)>0) {
                int oldX = x;
                long oldY = y;
                Collections.bin
                x=search(a,x);
                y= oldX - f[x-1];
                if((x==oldX && y==oldY) || (x==1 && y == 1))
                    break;
            }
            System.out.printf("Case #%d: %d-%d\n",j,x,y);
        }
    }
}
