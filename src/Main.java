public class Main {

    // 1. parenthesesCheck
    public static boolean parenthesesCheck (String str) {
        int checkf = 0;
        int checkl = 0;
        for (int i = 0; i<str.length(); i++) {
            if (str.charAt(i) == '(') {
                checkf++;
            }
            if (str.charAt(i) == ')') {
                checkl++;
            }
        }
        return checkf == checkl && str.charAt(0) == '(' && str.charAt(str.length()-1) == ')';
    }

    // 2. reverseInteger
    public static String reverseInteger(int reverse) {
        StringBuilder rs = new StringBuilder();
        while (reverse > 0) {
            rs.append(reverse%10);
            reverse = reverse/10;
        }
        return rs.toString();
    }

    // 3. encryptThis
    public static String encryptThis(String str) {
        StringBuilder rs = new StringBuilder();
        String[] words = str.split(" ");
        for (String word : words) {
            int length = word.length();
            int fcc = (int) word.charAt(0);
            if (length > 1) {
                char[] characters = word.toCharArray();
                char secondLetter = characters[1];
                characters[1] = characters[length - 1];
                characters[length - 1] = secondLetter;
                rs.append(fcc).append(characters, 1, length - 1);
            } else {
                rs.append(fcc);
            }
            rs.append(" ");
        }
        return rs.toString().trim();
    }


    // 4. decipherThis
    public static String decipherThis(String str) {
        StringBuilder rs = new StringBuilder();
        String[] words = str.split(" ");
        for (String word : words) {
            int firstCharCode = 0;
            int i = 0;
            while (i < word.length() && Character.isDigit(word.charAt(i))) {
                firstCharCode = firstCharCode * 10 + (word.charAt(i) - '0');
                i++;
            }
            char[] characters = word.substring(i).toCharArray();
            char secondLetter = characters[0];
            characters[0] = characters[characters.length - 1];
            characters[characters.length - 1] = secondLetter;
            rs.append((char) firstCharCode).append(new String(characters, 0, characters.length)).append(" ");
        }
        return rs.toString().trim();
    }

}