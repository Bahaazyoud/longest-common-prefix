package leet.code.solution;

import java.util.Arrays;

public class LongestCommonPrefix
{
    public String process(String[] strs) {
        failedIfNull(strs);
        Arrays.sort(strs);

        String firstElement  = strs[0];
        String lastElement = strs[strs.length - 1];
        StringBuilder commonPrefix = new StringBuilder();

        int index = 0;
        while (index  < getLength(firstElement)){
            if(isCharEquel(firstElement, index, lastElement)){
                appendTo(commonPrefix, firstElement, index);
                ++index;
            }else break;

        }
        return commonPrefix.toString();

    }

    private void failedIfNull(String[] strs) {
        if(strs == null)
            throw new NullPointerException("null strs array");
    }

    private boolean isCharEquel(String firstElement, int index, String lastElement) {
        return firstElement.charAt(index) == lastElement.charAt(index);
    }

    private int getLength(String firstElement) {
        return firstElement.length();
    }

    private void appendTo(StringBuilder commonPrefix, String firstElement, int index) {
        commonPrefix.append(firstElement.charAt(index));
    }
}
