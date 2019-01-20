import java.util.HashMap;

public class PalindromePermutation {

    public static void main(String[] args) {
        // true
        System.out.println("Tact cao: " + isPermutationOfPalindrome("Tact cao"));
        // true
        System.out.println("t  aco ca t: " + isPermutationOfPalindrome("t  aco ca t"));
        // true
        System.out.println("aqabcrbwtcqywerety: " + isPermutationOfPalindrome("aqabcrbwtcqywerety"));
        // true
        System.out.println("aqabcrbwtfcqywerety: " + isPermutationOfPalindrome("aqabcrbwftcqywerety"));
        // false
        System.out.println("aqabcrbwtfcgqywerety: " + isPermutationOfPalindrome("aqabcrbwgftcqywerety"));
        // true
        System.out.println("a: " + isPermutationOfPalindrome("a"));
        // false
        System.out.println("ab: " + isPermutationOfPalindrome("ab"));

    }

    private static boolean isPermutationOfPalindrome(String string){
        string = string.toLowerCase();
        HashMap<Character, Integer> characters = new HashMap<>();
        for (Character c : string.toCharArray()){
            if (c == ' ')
                continue;
            if (!characters.containsKey(c))
                characters.put(c, 1);
            else
                characters.put(c, characters.get(c) + 1);
        }
        int odd_num = 0;
        for (Integer i:characters.values()){
            if (i % 2 != 0)
                odd_num ++;
        }
        return odd_num <= 1;
    }
    }
