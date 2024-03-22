package leet.code.solution;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestCommonPrefixTest {

    @Test
    public void canCreate(){
        new LongestCommonPrefix();
    }

    @Test
    public void givenNullArrayOfStrings_whenCallProcessFunctionInLongestCommonPrefix_thenFail() {
       String[] strs = null;
       NullPointerException exception = Assertions.assertThrows(NullPointerException.class, () -> new LongestCommonPrefix().process(strs));
       Assertions.assertEquals("null strs array",exception.getMessage());
    }
    @Test
    public void givenEmptyArrayOfStrings_whenCallProcessFunctionInLongestCommonPrefix_theReturnEmptyString(){
        String[] strs = {""};
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        Assertions.assertEquals("",longestCommonPrefix.process(strs));
    }
    @Test
    public void givenArrayOfStringsWithNoCommonPrefix_whenCallProcessFunctionInLongestCommonPrefix_theReturnEmptyString(){
        String[] strs = {"dog","racecar","car"};
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        Assertions.assertEquals("",longestCommonPrefix.process(strs));
    }
    @Test
    public void givenArrayOfStringsWithCommonPrefix_whenCallProcessFunctionInLongestCommonPrefix_theReturnLongestCommonPrefix(){
        String[] strs = {"flower","flow","flight"};
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        Assertions.assertEquals("fl",longestCommonPrefix.process(strs));
    }
}
