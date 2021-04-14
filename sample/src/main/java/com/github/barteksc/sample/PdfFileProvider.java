package com.github.barteksc.sample;

public class PdfFileProvider {

    public static final String[] FILES = new String[]{"1.pdf", "2.pdf", "3.pdf", "4.pdf", "5.pdf",
            "6.pdf", "7.pdf", "8.pdf", "9.pdf", "10.pdf", "11.pdf", "12.pdf", "13.pdf"};
    private int mIndex = 0;

    public String getAssetFile() {
        return FILES[mIndex++ % FILES.length];
    }
}
