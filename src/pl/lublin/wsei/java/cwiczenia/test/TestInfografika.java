package pl.lublin.wsei.java.cwiczenia.test;

import pl.lublin.wsei.java.cwiczenia.Infografika;

public class TestInfografika {
    public static void main(String[] args) {
        Infografika infografika = new Infografika("\t\t<item>\n" +
                "\t\t\t<title><![CDATA[Infografika - Dzień Matki 26 maja]]></title>\n" +
                "\t\t\t<pubDate><![CDATA[Wed, 26 May 2021 10:03:00 +0200]]></pubDate>\n" +
                "\t\t\t<link>https://stat.gov.pl/infografiki-widzety/infografiki/infografika-dzien-matki-26-maja,112,1.html</link>\n" +
                "\t\t\t	<guid isPermaLink=\"false\">https://stat.gov.pl/infografiki-widzety/infografiki/infografika-dzien-matki-26-maja,112,1.html</guid>\n" +
                "\t\t\t\t<media:description type=\"plain\"><![CDATA[]]></media:description>\n" +
                "\t\t\t\t<media:thumbnail url=\"https://stat.gov.pl//gfx/portalinformacyjny/_thumbs/pl/defaultaktualnosci/5866/112/1/1/dzien_matki_2021-01,k1uUwl-caFOE6tCTiHtf.png\" />\n" +
                "\t\t\t	</media:content>\n" +
                "\t\t </item>\n");
    }
}