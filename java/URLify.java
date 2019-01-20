public class URLify {

    public static void main(String[] args){
        System.out.println(urlify("a b  ", 3));
        System.out.println(urlify("Hello World Hello    ", 17));
        System.out.println(urlify("Mr John Smith    ", 13));
    }

    private static String urlify(String string, int len){
        // convert string to char[]
        char[] strChar = string.toCharArray();
        for (int i = 0; i < strChar.length - 1; i++) {
            if (strChar[i] == ' '){
                // move characters to make space for %20
                System.arraycopy(strChar, i + 1, strChar, i + 3, len - i - 1);
//                for (int j = len - 1; i < j; j--) {
//                    strChar[j + 2] = strChar[j];
//                }
                // insert %20
                strChar[i] = '%';
                strChar[i + 1] = '2';
                strChar[i + 2] = '0';
                // update "true" length
                len += 2;
                // skip '2' and '0'
                i += 3;
            }
        }
        return new String(strChar);
    }
}
