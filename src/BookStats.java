public class BookStats implements Visitor {
    private int imageCount;
    private int tableCount;
    private int paragraphCount;

    @Override
    public void visitBook(Book b) {
        b.elements.forEach((child) -> child.accept(this));
    }

    @Override
    public void visitSection(Section s) {
        s.elements.forEach((child) -> child.accept(this));
    }

    @Override
    public void visitTableContent(TableContent tc) {

    }

    @Override
    public void visitParagraph(Paragraph p) {
        paragraphCount++;
    }

    @Override
    public void visitImageProxy(ImageProxy imgP) {
        imageCount++;
    }

    @Override
    public void visitImage(Image img) {
        imageCount++;
    }

    @Override
    public void visitTable(Table t) {
        tableCount++;
    }
    public void printStats() {
        System.out.println("Book Stats");
        System.out.printf("*** Number of images: %d\n", imageCount);
        System.out.printf("*** Number of tables: %d\n", tableCount);
        System.out.printf("*** Number of paragraphs: %d\n", paragraphCount);
    }
}
