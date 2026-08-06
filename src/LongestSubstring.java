public class LongestSubstring {

    public static String prefixSubstring(String[] s){
        if(s == null || s.length==0){
            return "";
        }
        String prefix = s[0];
        for(int i=1;i<s.length;i++){
            while(!s[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }


    public static void main(String[] args) {
        String[] arr = {"flower", "flow", "flight"};

        String res = prefixSubstring(arr);
        System.out.println(res);


    }
}
