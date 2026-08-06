import java.util.*;
public class GroupsAnagram {

    public static List<List<String>> groupsAnagram(String[] str){
        HashMap<String ,List<String>> map = new HashMap<>();
        for(String word :str){
            char[] ch = word.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(word);
        }
        return new ArrayList<>(map.values());
    }



    public static void main(String[] args) {
        String[] str ={"cat", "act", "dog", "god", "tac"};
       List<List<String>> res = groupsAnagram(str);
        System.out.println(res);

    }
}
