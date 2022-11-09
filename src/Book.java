import java.util.ArrayList;
import java.util.List;

public class Book extends Section{
    private final List<Author> authors = new ArrayList<>();
    public Book(String title) {

        super(title);
    }
    public void addContent(Element content){

        add(content);
    }

    public void addAuthor(Author author){

        this.authors.add(author);
    }

    public void print(){
        System.out.println("Authors:");
        for(Author author: authors){
            author.print();
        }
        super.print();
    }
    public void accept(Visitor v){
        v.visitBook(this);

    }
}
