import java.util.HashSet;

public class LongestLengthSubstring {

    public static int longestlengthSubstring(String s){
        HashSet<Character> set = new HashSet<>();
        int left =0;
        int maxlength =0;
        for(int right =0;right<s.length();right++){
           char ch = s.charAt(right);
           while(set.contains(ch)){
               set.remove(s.charAt(left));
               left++;

           }
           set.add(ch);
           maxlength =Math.max(maxlength,right-left+1);
        }
        return maxlength;
    }


    public static void main(String[] args) {
        String s ="abcabc";
        int res = longestlengthSubstring(s);
        System.out.println(res);
    }
}
