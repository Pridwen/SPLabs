package Labul;

import java.util.Random;
public class BookStats implements Visitor {
    private int imageCount;
    private int tableCount;
    private int paragraphCount;
    private int contorImg = 1;
    private int contorTable = 1;
    private int contorParagraph = 1;
    public int RNG(){
        Random rand = new Random(); //instance of random class
        int upperbound = 30;
        return rand.nextInt(upperbound);
    }
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
        System.out.printf("Paragraf %d .... pagina %d\n",contorParagraph, RNG());
        paragraphCount++;
        contorParagraph++;
    }

    @Override
    public void visitImageProxy(ImageProxy imgP) {
        System.out.printf("Imaginea Proxy %d .... pagina %d\n",contorImg, RNG());
        imageCount++;
        contorImg++;
    }

    @Override
    public void visitImage(Image img) {
        System.out.printf("Imaginea %d .... pagina %d\n",contorImg, RNG());
        imageCount++;
    }

    @Override
    public void visitTable(Table t) {
        System.out.printf("Labul.Table %d .... pagina %d\n",contorTable, RNG());
        tableCount++;
        contorTable++;
    }
    public void printStats() {
        System.out.println("Labul.Book Stats");
        System.out.printf("*** Number of images: %d\n", imageCount);
        System.out.printf("*** Number of tables: %d\n", tableCount);
        System.out.printf("*** Number of paragraphs: %d\n", paragraphCount);
    }
}
