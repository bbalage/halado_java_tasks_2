package hu.meiit.haladojava.isa;

import hu.meiit.haladojava.isahasa.HtmlText;

public class ItalicAndBoldHtmlText extends HtmlText {

    public ItalicAndBoldHtmlText(String plainText) {
        super(plainText);
    }

    @Override
    public String getPlainText() {
        return String.format("<i><b>%s</b></i>", super.getPlainText());
    }
}
