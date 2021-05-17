package hu.meiit.haladojava.isahasa;

public class HtmlText implements TextSource {
    private String plainText;

    public HtmlText(String plainText) {
        if (plainText == null) {
            this.plainText = "";
            return;
        }
        this.plainText = plainText;
    }

    @Override
    public String getPlainText() {
        return plainText;
    }
}
