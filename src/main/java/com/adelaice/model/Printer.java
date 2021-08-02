package com.adelaice.model;

public class Printer {

    private int tonerLevel = 0;
    private int pagesPrinted;
    private boolean isDuplex;

    public Printer(int tonerLevel, boolean isDuplex) {
        if (tonerLevel >= 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        }
        this.pagesPrinted = 0;
        this.isDuplex = isDuplex;
    }

    public void fillUpToner(int inkAmount) {
        if (this.tonerLevel < 100) {
            this.tonerLevel += inkAmount;
            if (this.tonerLevel + inkAmount > 100) {
                this.tonerLevel = 100;
            }
        }
        System.out.println("Toner filled up... Level: " + this.tonerLevel);
    }

    public void printPage(int pages) {
        int pagesToPrint = pages;

        if (isDuplex) {
            pagesToPrint = (pages / 2) + (pages % 2);
            System.out.println("Printing in duplex mode...");
        }

        this.tonerLevel -= 20;
        this.pagesPrinted += pagesToPrint;
        System.out.println("Printing a page... Total pages printed: " + this.pagesPrinted);
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplex() {
        return isDuplex;
    }
}
