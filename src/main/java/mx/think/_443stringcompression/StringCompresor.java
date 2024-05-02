package mx.think._443stringcompression;

public class StringCompresor {
    public int compress(char[] chars) {
        if (chars == null || chars.length <= 1) {
            return 1;
        }
        String compressedString = getCompressedString(chars);
        System.out.println(compressedString);
        char[] compressedChars = compressedString.toCharArray();
        System.arraycopy(compressedChars, 0, chars, 0, compressedChars.length);
        return compressedString.length();
    }

    private String getCompressedString(char[] chars) {
        StringBuilder compressedString = new StringBuilder();
        char previous = chars[0];
        int count = 1;
        for (int i = 1; i < chars.length; i++) {
            if(chars[i] == previous) {
                count++;
            }
            else {
                appendToString(compressedString, previous, count);
                previous = chars[i];
                count = 1;
            }
        }
        appendToString(compressedString, previous, count);
        return compressedString.toString();
    }

    private static void appendToString(StringBuilder compressedString, char previous, int count) {
        if (count == 1) {
            compressedString.append(previous);
        } else{
            compressedString.append(previous).append(count);
        }
    }
}
