import java.util.*;

public class E {
    
    public static String s;
    public static int n;
    public static int[][] res = new int[1001][1001];
    
    public static int isPossible(int pos, int r) {
        if(pos==s.length()){
            if(r==0)
                return 1;
            else
                return 0;
        }
        if(res[pos][r]!=-1)
            return res[pos][r];
        int result = 0;
        if(s.charAt(pos)=='?') {
            for(int i=0;i<=9;++i) {
                if(pos==0 && i==0)
                    continue;
                if(isPossible(pos+1,(10*r+i)%n)==1)
                    result=1;
            }
        } else {
            if(isPossible(pos+1,(10*r+((int)s.charAt(pos)-(int)'0'))%n)==1)
                result=1;
        }
        res[pos][r]= result;
        return result;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
            s = sc.next();
            n = sc.nextInt();
            
            for(int[] row: res)
                Arrays.fill(row,-1);
//            System.out.println(s+" "+n);
            if(isPossible(0,0)==0)
                System.out.println("*");
            else {
                String result="";
                int r=0;
                for(int i=0;i<s.length();++i) {
                    if(s.charAt(i)=='?') {
                        for(int j=0;j<=9;++j) {
                            if(i==0 && j==0)
                                continue;
                            if(isPossible(i+1,(10*r+j)%n)==1) {
                                r=(10*r+j)%n;
                                result+= Integer.toString(j);
                                break;
                            }                                
                        }
                    } else {
                        result+=s.charAt(i);
                        r=(10*r+(int)s.charAt(i)-(int)'0')%n;
                    }
                }
                for(int i=0;i<result.length();++i)
                    System.out.print(result.charAt(i));
                System.out.println();
            }
        }
    
}
