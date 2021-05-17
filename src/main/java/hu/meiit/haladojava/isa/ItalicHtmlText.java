package hu.meiit.haladojava.isa;

import hu.meiit.haladojava.isahasa.HtmlText;

public class ItalicHtmlText extends HtmlText {

    public ItalicHtmlText(String plainText) {
        super(plainText);
    }

    @Override
    public String getPlainText() {
        return String.format("<i>%s</i>", super.getPlainText());
    }
}
