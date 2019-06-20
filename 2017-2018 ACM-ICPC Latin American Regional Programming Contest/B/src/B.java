import java.util.*;

public class B {
    
    public static ArrayList <Integer> res = new ArrayList <Integer> ();
    
    public static boolean isVowel(char c) {
        return (c=='u' || c=='e' || c=='o' || c=='a' || c=='i');
    }
    
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()) {
            s = sc.nextLine();
            int countVowel = 0;
            for(int i=0;i<s.length();++i)
                if(isVowel(s.charAt(i)))
                    ++countVowel;
            if(countVowel == 0) {
                System.out.println(1);
                continue;
            }
            if(!isVowel(s.charAt(0)))
            {
                System.out.println(0);
                continue;
            }
            if(countVowel == 1) {
                System.out.println(s.length());
                continue;
            }
            res = new ArrayList <Integer> ();
            for(int i=0;i<s.length();++i) {
                int count = 0;
                ++i;
                while(i<s.length() && !isVowel(s.charAt(i))) {
                    ++count; ++i;
                }
                if(i>=s.length())
                    break;
                res.add(count);
                --i;
            }
            System.out.println(res.get((int)res.size()/2)+1);
        }
    }
    
}
