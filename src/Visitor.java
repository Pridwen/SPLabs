public interface Visitor  {
    void visitBook(Book b);
    void visitSection (Section s);
    void visitTableContent (TableContent tc);
    void visitParagraph (Paragraph p);
    void visitImageProxy (ImageProxy imgP);
    void visitImage (Image img);
    void visitTable (Table t);
}
