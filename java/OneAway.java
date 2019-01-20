public class OneAway {
    public static void main(String[] args) {
        System.out.println(oneAway("abc12", "cba1"));
        System.out.println(oneAway("abc", "abc"));
        System.out.println(oneAway("abc", "abca"));
        System.out.println(oneAway("abc", "aabc"));
    }

    private static boolean oneAway(String string1, String string2){
        if (Math.abs(string1.length()-string2.length()) > 1)
            return false;
        String[] strings = sortS(string1, string2);
        String smaller = strings[0];
        String larger = strings[1];
        int away = 0;
//        iterate through small and large, finding where characters are not equal
        for (int i = 0; i < smaller.length(); i++) {
            if (larger.charAt(i) != smaller.charAt(i)){
                away++;
                for (int j = i + 1; j < larger.length(); j++) {
                    if (larger.charAt(j) != smaller.charAt(i))
                        away++;
                    else
                        break;
                }
            }
        }
        return away <= 1;
    }

    private static String[] sortS(String string1, String string2){
        if (string1.length() < string2.length())
            return new String[] {string1, string2};
        return new String[] {string2, string1};
    }
    }
