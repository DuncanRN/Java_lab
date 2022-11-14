public class Printer {

    private int sheetsLeft;
    private int tonerLeft;

    public Printer(int sheetsLeft, int tonerLeft){
        this.sheetsLeft = sheetsLeft;
        this.tonerLeft = tonerLeft;
    }
    public int getSheetsLeft() {
        return this.sheetsLeft;
    }

    public void printPages(int pages, int copies) {
        int pagesNeeded = pages*copies;
        if(this.sheetsLeft> pagesNeeded){
            sheetsLeft -= pagesNeeded;
            tonerLeft -= pagesNeeded;
        }
    }

    public int getTonerLeft() {
        return tonerLeft;
    }
}
