package Labul;

public class Main {
    public static void main(String[] args) {
        Book myBook = new Book("my book");
        DocumentManager.getInstance().setBook(myBook);
        Author me = new Author("myself");
        myBook.addAuthor(me);
        Section cap1 = new Section("Capitolul 1");
        myBook.addContent(cap1);
        Paragraph p1 = new Paragraph("Labul.Paragraph 1");
        cap1.add(p1);
        Paragraph p2 = new Paragraph("Labul.Paragraph 2");
        cap1.add(p2);
        Paragraph p3 = new Paragraph("Labul.Paragraph 3");
        cap1.add(p3);
        Paragraph p4 = new Paragraph("Labul.Paragraph 4");
        cap1.add(p4);
        Printing();
    }
    private static void Printing() {
        DocumentManager.getInstance().getBook().print();
    }
}
/*
public static void main(String[] args) {
        Section cap1 = new Section("Capitolul 1");
        Paragraph p1 = new Paragraph("Labul.Paragraph 1");
        cap1.add(p1);
        Paragraph p2 = new Paragraph("Labul.Paragraph 2");
        cap1.add(p2);
        Paragraph p3 = new Paragraph("Labul.Paragraph 3");
        cap1.add(p3);
        Paragraph p4 = new Paragraph("Labul.Paragraph 4");
        cap1.add(p4);
        cap1.add(new ImageProxy("ImageOne"));
        cap1.add(new Image("ImageTwo"));
        cap1.add(new Paragraph("Some text"));
        cap1.add(new Table("Labul.Table 1"));
        BookStats stats = new BookStats();
        cap1.accept(stats);
        stats.printStats();
    }
 */