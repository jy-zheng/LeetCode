import java.util.*;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s = "pwwkew123";
        int longestLength = 0;
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++){
            System.out.println(s.charAt(i));
            if (!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),i);
            }else{
                System.out.println(map.toString());
                i = map.get(s.charAt(i));
                System.out.println(i);
                if (map.size() > longestLength){
                    longestLength = map.size();
                }
                map.clear();
            }

        }
        if (map.size() > longestLength){
            longestLength = map.size();
        }

        System.out.println(longestLength);
    }
}
