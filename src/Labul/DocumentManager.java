package Labul;

public class DocumentManager {
    private static DocumentManager instance = new DocumentManager();
    private Book myBook;
    public static DocumentManager getInstance() {
        return instance;
    }
    public Book getBook(){
        return this.myBook;
    }
    public DocumentManager setBook(Book myBook){
         this.myBook = myBook;
         return null;
    }
}
