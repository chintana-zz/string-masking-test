import java.util.Arrays;

public class Test3 {
        public static void main(String[] args) {
                for (int i = 0; i < Integer.MAX_VALUE; ++i) {
                        String str = replaceChars("898fe51c-f07e-36fa-aed6-8080305772cf");
                }
        }

        private static String replaceChars(String token) {
                if ((token != null) && (token.length() > 0) && (token.length() > 4)) {
                        // mask everything after first 4 chars
                        char[] tokenChars = token.toCharArray();
                        token.getChars(0, 4, tokenChars, 0);
                        Arrays.fill(tokenChars, 4, tokenChars.length, '*');
                        return(new String(tokenChars));
                } else if (token.length() <= 4) {
                        // nothing to mask
                        return token;
                }
                // empty token
                return "";
        }
}