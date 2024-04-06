package mx.think.zip_strings;

public class ZipString {
    public String mergeAlternately(String word1, String word2) {
        int word1Len = word1.length();
        int word2Len = word2.length();
        int lenghtDif = Math.abs(word1Len - word2Len);

        if (word1Len > word2Len) {

            String tail = getTail(lenghtDif, word1);
            String word1Cut = word1.substring(0, word1Len - lenghtDif);
            return mergeSameLength(toArray(word1Cut), toArray(word2)) +  tail;

        } else if (word1Len < word2Len) {

            String tail = getTail(lenghtDif, word2);
            String word2Cut = word2.substring(0, word2Len - lenghtDif);
            return mergeSameLength(toArray(word1), toArray(word2Cut)) + tail;
        }

        return mergeSameLength(toArray(word1), toArray(word2));
    }

    private String mergeSameLength(char[] array, char[] array1) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < array.length; i++) {

            result.append(array[i]);
            result.append(array1[i]);

        }
        return result.toString();
    }

    private char[] toArray(String str) {
        return str.toCharArray();
    }

    private String getTail(int upperLimit, String stringToCut) {
        int lenght = stringToCut.length();
        return stringToCut.substring(lenght-upperLimit, lenght);
    }
}
