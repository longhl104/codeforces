import java.util.*;
import java.io.*;

public class E {
    private static String secret;
    private static int[] d1 = new int[256];
    private static int[] d2 = new int[256];

    public static void init(){
        E.d1[(int)'k'] = 1;
        E.d1[(int)'a'] = 2;
        E.d1[(int)'n'] = 1;
        E.d1[(int)'g'] = 1;
        E.d1[(int)'r'] = 1;
        E.d1[(int)'o'] = 2;
        E.d2[(int)'k'] = 1;
        E.d2[(int)'i'] = 3;
        E.d2[(int)'w'] = 1;
        E.d2[(int)'b'] = 1;
        E.d2[(int)'r'] = 1;
        E.d2[(int)'d'] = 1;
    }

    public static void main(String[] args) {
        init();
        Scanner sc = new Scanner (System.in);
        E.secret = sc.nextLine();
        int res1=0, res2=0;
        for(int i=0;i<E.secret.length();++i) {
            res1+=d1[(int)E.secret.toLowerCase().charAt(i)];
        }
        for(int i=0;i<E.secret.length();++i) {
            res2+=d2[(int)E.secret.toLowerCase().charAt(i)];
        }
        // System.out.println(res1+" "+res2);
        if(res1>res2){
            System.out.println("Kangaroos");
        }else {
            if(res1<res2)
                System.out.println("Kiwis");
            else
                System.out.println("Feud continues");
        }
    }
}
