package ArrayAndHashing;

import java.util.Arrays;
import java.util.HashMap;

public class ValidAnagram {

    //by converting in char array
    //tc - o(nlogn)
    //sc - o(n)
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        char c1[] = s.toCharArray();
        char c2[] = t.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        return Arrays.equals(c1,c2);
    }

    //using hashing and array (faster and efficient than hashmap, used constant space)
    public boolean isAnagram2(String s, String t) {

        if(s.length()!=t.length()) return false;

        int[] counter = new int[26];

        for(int i=0; i<s.length(); i++){
            counter[s.charAt(i)-'a']++;
            counter[t.charAt(i)-'a']--;
        }

        for(int i:counter){
            if(i !=0)
                return false;
        }
        return true;
    }

    //using hashing and hashmap
    public boolean isAnagram3(String s, String t) {

        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            hm.put(ch,hm.getOrDefault(ch, 0) + 1);
        }

        for(int i=0; i<t.length();i++){
            char ch = t.charAt(i);
            hm.put(ch, hm.getOrDefault(ch,0) - 1);
        }

        for(int v : hm.values()){
            if(v != 0)
                return false;
        }
        return true;
    }
}
