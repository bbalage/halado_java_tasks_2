package hu.meiit.haladojava.isa;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItalicHtmlTextTest {

    @Test
    public void testReturnsBasicSentence() {
        //GIVEN
        final String inputSentence = "This is the sentence.";
        final ItalicHtmlText italicHtmlText = new ItalicHtmlText(inputSentence);
        final String expectedSentence = "<i>This is the sentence.</i>";
        //WHEN
        final String returnedSentence = italicHtmlText.getPlainText();
        //THEN
        assertEquals(expectedSentence, returnedSentence);
    }

    @Test
    public void testNullInput() {
        //GIVEN
        final String expected = "<i></i>";
        final ItalicHtmlText italicHtmlText = new ItalicHtmlText(null);
        //WHEN
        final String returnedSentence = italicHtmlText.getPlainText();
        //THEN
        assertEquals(expected, returnedSentence);
    }
}
