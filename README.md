This repository contains one of the tasks for the university course Advanced Java. The original description of the task is copied to the README and can be viewed below.

## 2 Nincs teszt a feladathoz, kellene írni

Adott a következő leírás. Készítsd el az osztályokat, és írj hozzá teszteket!

Deklarálj egy TextSource interfészt az isahasa csomagban, melyben csak egy metódus van: String getPlainText().

Hozz létre egy HtmlText osztályt az isahasa csomagban, ami implementálja a TextSource interfészt. Egy plainText attribútumban tárolja a kívánt szöveget, melyet a konstruktorban kap meg.

- a getPlainText() ebben az esetben csak visszaadja a tárolt szöveget.

A BoldHtmlText a vastagon szedett szöveget megvalósító osztály az isa csomagban van, és a HtmlText-ből származik.

- a konstruktorban megkapott szöveget a super-nek adjuk át, így inicializáljuk.
- a getPlainText <b> és </b> közzé fogja az ősben definiált getPlainText eredményét.

A ItalicHtmlText a dőlten szedett szöveget megvalósító osztály az isa csomagban van, és a HtmlText-ből származik.

- a konstruktorban megkapott szöveget a super-nek adjuk át.
- a getPlainText <i> és </i> közzé fogja az ősben definiált getPlainText eredményét.

A UnderlinedHtmlText az aláhúzott szöveget megvalósító osztály az isa csomagban van, és a HtmlText-ből származik.

- a konstruktorban megkapott szöveget a super-nek adjuk át.
- a getPlainText <u> és </u> közzé fogja az ősben definiált getPlainText eredményét.

A ItalicAndBoldHtmlText a vastag betűt megvalósító osztály az isa csomagban van, és a HtmlText-ből származik.

- a konstruktorban megkapott szöveget a super-nek adjuk át.
- a getPlainText <i><b> és </b></i> közzé fogja az ősben definiált getPlainText eredményét.
