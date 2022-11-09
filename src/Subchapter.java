import java.util.ArrayList;

public class Subchapter {
    private final String name;
    private final ArrayList<Element> elements = new ArrayList<>();

    public Subchapter(String name) {

        this.name = name;
    }
    public void print() {
        System.out.println("Subchapter: " + name);
        for (Element e: elements){
            e.print();
        }
    }
    public void createNewParagraph(String s) {
        Paragraph paragraph = new Paragraph(s);
        elements.add(paragraph);
    }
    public void createNewImage(String s) {
        Image image = new Image(s);
        elements.add(image);
    }
    public void createNewTable(String s) {
        Table table = new Table(s);
        elements.add(table);
    }
}