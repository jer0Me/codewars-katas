import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringMergerTest {

    @Test
    public void testAllEmptyStrings() {
        assertTrue(StringMerger.isMerge("", "", ""));
    }

    @Test
    public void testWithEmptySecondPart() {
        assertTrue(StringMerger.isMerge("code", "code", ""));
    }

    @Test
    public void testWithEmptyFirstPart() {
        assertTrue(StringMerger.isMerge("wars", "", "wars"));
    }

    @Test
    public void testStringSplitted() {
        assertTrue(StringMerger.isMerge("codewars", "code", "wars"));
    }

    @Test
    public void testShouldReturnFalseWhenFirstPartDontHaveTheCharactersInOrderAccordingToTheText() {
        assertFalse(StringMerger.isMerge("codewars", "dcor", "whaever"));
    }

    @Test
    public void testShouldReturnFalseWhenSecondPartDontHaveTheCharactersInOrderAccordingToTheText() {
        assertFalse(StringMerger.isMerge("codewars", "cdwr", "eoas"));
    }

    @Test
    public void testPartsWithRandomCharacters() {
        assertTrue(StringMerger.isMerge("codewars", "cdwr", "oeas"));
    }

    @Test
    public void testPartsWithRandomCharactersAndCharactersDuplicated() {
        assertTrue(StringMerger.isMerge("coconat", "ccnt", "ooa"));
    }

}
