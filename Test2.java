import org.apache.commons.lang3.StringUtils;

public class Test2 {
        public static void main(String[] args) {
                for (int i = 0; i < Integer.MAX_VALUE; ++i) {
                        String str = replaceChars("898fe51c-f07e-36fa-aed6-8080305772cf");
                }          
        }

        private static String replaceChars(String token) {
                if ((token != null) && (token.length() > 0) && (token.length() > 4)) {
                        String maskString = StringUtils.repeat("x", 36);
                        return StringUtils.overlay(token, maskString, 4, 36);
                } else if (token.length() <= 4) {
                        // nothing to mask
                        return token;
                }
                // empty token
                return "";
        }
}