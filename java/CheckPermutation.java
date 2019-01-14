import java.util.ArrayList;
import java.util.List;

public class CheckPermutation {

    public static void main(String[] args){
        System.out.println(isPermutation("hello", "olleh"));
        System.out.println(isPermutation("hello", "elloh"));
        System.out.println(isPermutation("hello", "llohe"));
        System.out.println(isPermutation("hello", "lhole"));
        System.out.println(isPermutation("abc", "def"));
        System.out.println(isPermutation("abc", "axc"));
        System.out.println(isPermutation("abac", "axc"));
    }

    private static boolean isPermutation(String string1, String string2){
        // must be same length to be a permutation
        if (string1.length() != string2.length())
            return false;
        // convert Strings to ArrayLists
        List<Character> s1List = new ArrayList<>();
        List<Character> s2List = new ArrayList<>();
        for (char c : string1.toCharArray())
            s1List.add(c);
        for (char c : string2.toCharArray())
            s2List.add(c);
        // remove Characters from s1List from s2List
        for (Character c : s1List)
            // if a character from s1List is not in s2List, not a permutation
            if (!s2List.remove(c))
                return false;
        // same length and all characters removed, permutation
        return true;
    }
}
