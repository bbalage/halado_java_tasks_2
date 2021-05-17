package hu.meiit.haladojava.isa;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItalicAndBoldHtmlTextTest {

    @Test
    public void testReturnsBasicSentence() {
        //GIVEN
        final String inputSentence = "This is the sentence.";
        final ItalicAndBoldHtmlText italicAndBoldHtmlText = new ItalicAndBoldHtmlText(inputSentence);
        final String expectedSentence = "<i><b>This is the sentence.</b></i>";
        //WHEN
        final String returnedSentence = italicAndBoldHtmlText.getPlainText();
        //THEN
        assertEquals(expectedSentence, returnedSentence);
    }

    @Test
    public void testNullInput() {
        //GIVEN
        final String expected = "<i><b></b></i>";
        final ItalicAndBoldHtmlText italicAndBoldHtmlText = new ItalicAndBoldHtmlText(null);
        //WHEN
        final String returnedSentence = italicAndBoldHtmlText.getPlainText();
        //THEN
        assertEquals(expected, returnedSentence);
    }
}
