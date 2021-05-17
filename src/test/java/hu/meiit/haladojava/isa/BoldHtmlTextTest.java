package hu.meiit.haladojava.isa;

import hu.meiit.haladojava.isahasa.HtmlText;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BoldHtmlTextTest {

    @Test
    public void testReturnsBasicSentence() {
        //GIVEN
        final String inputSentence = "This is the sentence.";
        final BoldHtmlText boldHtmlText = new BoldHtmlText(inputSentence);
        final String expectedSentence = "<b>This is the sentence.</b>";
        //WHEN
        final String returnedSentence = boldHtmlText.getPlainText();
        //THEN
        assertEquals(expectedSentence, returnedSentence);
    }

    @Test
    public void testNullInput() {
        //GIVEN
        final String expected = "<b></b>";
        final BoldHtmlText boldHtmlText = new BoldHtmlText(null);
        //WHEN
        final String returnedSentence = boldHtmlText.getPlainText();
        //THEN
        assertEquals(expected, returnedSentence);
    }
}
