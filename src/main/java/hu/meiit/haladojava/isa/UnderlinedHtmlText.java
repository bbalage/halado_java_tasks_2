package hu.meiit.haladojava.isa;

import hu.meiit.haladojava.isahasa.HtmlText;

public class UnderlinedHtmlText extends HtmlText {

    public UnderlinedHtmlText(String plainText) {
        super(plainText);
    }

    @Override
    public String getPlainText() {
        return String.format("<u>%s</u>", super.getPlainText());
    }
}
