import java.util.*;

public class B {
    private static long n,m,c;
    private final static long MOD = 1000000007;
    
    public static long gcd(long a,long b) {
        if(b==0)
            return a;
        return gcd(b,(a%b));
    }
    public static long pow(long a,long b) {
        if(b==0)
            return 1;
        if(b==1)
            return a%MOD;
        long tmp = pow(a,(long)b/2);
        if(b%2==0)
            return (tmp*tmp)%MOD;
        return ((tmp*tmp)%MOD*a%MOD)%MOD;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n=sc.nextLong();
        m=sc.nextLong();
        c=sc.nextLong();
//        long res = pow(m,MOD-2);
        long res = 0;
        long w = pow(c,n*n);
        for(long i=1;i<=m;++i) {
            res = (res + pow(w,gcd(i,m)))%MOD;
        }
        res = (res*pow(m,MOD-2))%MOD;
        System.out.println(res);
    }
    
}
