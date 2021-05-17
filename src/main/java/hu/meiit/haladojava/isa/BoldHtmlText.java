package hu.meiit.haladojava.isa;

import hu.meiit.haladojava.isahasa.HtmlText;

public class BoldHtmlText extends HtmlText {

    public BoldHtmlText(String plainText) {
        super(plainText);
    }

    @Override
    public String getPlainText() {
        return String.format("<b>%s</b>", super.getPlainText());
    }
}
