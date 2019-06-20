import java.util.*;
import java.io.*;

public class B {
    private static ArrayList <Integer> a = new ArrayList <Integer> ();
    private static HashMap <Integer, ArrayList <Integer>> d = new HashMap <Integer, ArrayList <Integer>>();
    public static void process (int x, int y) {
        // if(!B.a.contains(x))
        //     return;
        // for(int i=0;i<B.a.size();) {
        //     if(B.a.get(i) == x) {
        //         B.a.add(i+1,y);
        //         if(B.a.size() == 100001)
        //             B.a.remove(100000);
        //         i+=2;
        //     } else {
        //         ++i;
        //     }
        // }

    }
    public static void init(){
        d.put(0, new ArrayList <Integer> (){{add(0)}});
    }
    public static void main(String[] args) {
        init();
        int n,l,r,x,y;
        try{
            Scanner sc = new Scanner(new File(args[0]));
            // Scanner sc = new Scanner(System.in);
            n=sc.nextInt();
            l=sc.nextInt();
            r=sc.nextInt();
            for(int i=0;i<n;++i){
                x=sc.nextInt();
                y=sc.nextInt();
                process(x,y);
            }
            // for(int i=0;i<B.a.size();++i) {
            //     System.out.print(B.a.get(i)+" ");
            // }
            int size = B.a.size();
            if((r-1)/size-l/size==0) {
                for(int i=l%size;i<=(r-1)%size;++i) {
                    System.out.print(B.a.get(i));
                    if(i==(r-1)%size)
                        System.out.println();
                    else
                        System.out.print(" ");
                }
            } else {
                // System.out.println("Case 3");
                for(int i=l%size;i<size;++i)
                    System.out.print(B.a.get(i)+ " ");
                for(int i=0;i<(r-1)/size-l/size-1;++i)
                    for(int j=0;j<size;++j)
                        System.out.print(B.a.get(j) + " ");
                for(int i=0;i<=(r-1)%size;++i) {
                    System.out.print(B.a.get(i));
                    if(i==(r-1)%size)
                        System.out.println();
                    else
                        System.out.print(" ");
                    }
            }
            // for(int i=l/size;i)
        } catch (FileNotFoundException e) {}
    }
}
