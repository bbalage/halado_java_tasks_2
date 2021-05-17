package hu.meiit.haladojava.isahasa;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HtmlTextTest {

    @Test
    public void testReturnsBasicSentence() {
        //GIVEN
        final String inputSentence = "This is the sentence.";
        final HtmlText htmlText = new HtmlText(inputSentence);
        //WHEN
        final String returnedSentence = htmlText.getPlainText();
        //THEN
        assertEquals(inputSentence, returnedSentence);
    }

    @Test
    public void testNullInput() {
        //GIVEN
        final String expected = "";
        final HtmlText htmlText = new HtmlText(null);
        //WHEN
        final String returnedSentence = htmlText.getPlainText();
        //THEN
        assertEquals(expected, returnedSentence);
    }
}
