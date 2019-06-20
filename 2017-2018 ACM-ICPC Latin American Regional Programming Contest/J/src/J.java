import java.util.*;

public class J {

    public static int[] d = new int[100001];
    
    public static int gcd(int a,int b) {
        if(b==0)
            return a;
        return gcd(b,a%b);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        String s;
        int res = 0;
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        int n = s.length();
        ArrayList <Integer> arr = new ArrayList <Integer> ();
        for(int i=1;i*i<=n;++i) {
            if(n%i==0) {
                if(i*i==n){
                    arr.add(i);
                    break;
                }
                arr.add(i);
                arr.add(n/i);
            }
        }
//        for(int i=0;i<arr.size();++i)
//            System.out.println(arr.get(i));
        for(int i=1;i<n;++i) {
            d[gcd(i,n)]+=1;
        }
        boolean ok;
        boolean enough;
        for(int i=0;i<arr.size();++i) {
            enough = false;
            for(int j=0;j<arr.get(i);++j) {
                ok=true;
                for(int k=j;k<n;k+=arr.get(i)) {
                    if(s.charAt(k)=='P'){
                        ok=false;
                        break;
                    }
                }
                if(ok) {
                    enough = true;
                    break;
                }
            }
            if(enough)
                res+=d[arr.get(i)];
        }
        System.out.println(res);
    }
    
}
