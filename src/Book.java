import java.util.ArrayList;
public class Book {
    private final String title;
    private ArrayList<Author> authors;
    private final ArrayList<Chapter> chapters = new ArrayList<>();

    public Book(String title) {
        this.title = title;
    }

    public void print() {
        System.out.println(this.title);
        for(Author ath : authors) {
            ath.print();
        }
        for(Chapter ch: chapters) {
            ch.print();
        }
    }

    public void addAuthor(Author ath) {
        if(authors == null) {
            authors = new ArrayList<>();
        }
        authors.add(ath);
    }

    public int createChapter(String str) {
        chapters.add(new Chapter(str));
        return chapters.size() - 1;
    }

    public Chapter getChapter(int i) {
        return chapters.get(i);
    }
}
