public class Main {

    public static void main(String[] args) {
        Book book = new Book( "Tabara" );
        Author author = new Author( "Louis Sachar" );
        book.addAuthor(author);

        int indexOne = book.createChapter( "Capitolul 1" );
        Chapter ch1 = book.getChapter(indexOne);
        int indexOnesubchOne = ch1.createSubChapter( "Subcapitolul 1.1" );
        Subchapter subchOneOne = ch1.getSubChapter(indexOnesubchOne);

        subchOneOne.createNewParagraph("Paragraph 1");
        subchOneOne.createNewParagraph("Paragraph 2");
        subchOneOne.createNewParagraph("Paragraph 3");
        subchOneOne.createNewImage("Image 1");
        subchOneOne.createNewParagraph("Paragraph 4");
        subchOneOne.createNewTable("Table 1");
        subchOneOne.createNewParagraph("Paragraph 5");
        subchOneOne.print();
    }
}
// on run 
//Subchapter: Subcapitolul 1.1
//Paragraph: Paragraph 1
//Paragraph: Paragraph 2
//Paragraph: Paragraph 3
//Paragraph: Paragraph 4
//Paragraph: Paragraph 5
//Image with name: Image 1
//Table with Title: Table 1
