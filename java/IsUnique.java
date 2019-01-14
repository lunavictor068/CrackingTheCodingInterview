import java.util.HashSet;

public class IsUnique{

    public static void main(String[] args){
        String[] tests = {"abcde", "abcdea", "test", "abbc"};
        System.out.println("Testing isUnique with HashSet");
        for (String test : tests)
            System.out.println(test + ": " + isUnique(test));
        System.out.println("Testing isUnique without HashSet");
        for (String test : tests)
            System.out.println(test + ": " + isUniqueNoDS(test));    }

    private static boolean isUnique(String string){
        HashSet<Character> uniqueSet = new HashSet<>();
        for (char c : string.toCharArray())
            uniqueSet.add(c);
        return uniqueSet.size() == string.length();
    }

    private static boolean isUniqueNoDS(String string){
        for (int i = 0; i < string.length(); i++) {
            for (int j = 0; j < string.length(); j++) {
                if (i == j) continue;
                if (string.charAt(i) == string.charAt(j))
                    return false;
            }
        }
        return true;
    }
}