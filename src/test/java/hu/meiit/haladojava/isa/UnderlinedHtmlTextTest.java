package hu.meiit.haladojava.isa;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UnderlinedHtmlTextTest {

    @Test
    public void testReturnsBasicSentence() {
        //GIVEN
        final String inputSentence = "This is the sentence.";
        final UnderlinedHtmlText underlinedHtmlText = new UnderlinedHtmlText(inputSentence);
        final String expectedSentence = "<u>This is the sentence.</u>";
        //WHEN
        final String returnedSentence = underlinedHtmlText.getPlainText();
        //THEN
        assertEquals(expectedSentence, returnedSentence);
    }

    @Test
    public void testNullInput() {
        //GIVEN
        final String expected = "<u></u>";
        final UnderlinedHtmlText underlinedHtmlText = new UnderlinedHtmlText(null);
        //WHEN
        final String returnedSentence = underlinedHtmlText.getPlainText();
        //THEN
        assertEquals(expected, returnedSentence);
    }
}
