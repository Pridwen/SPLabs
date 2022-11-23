package Testul;

public interface Element {
    void print();
    void accept(Visitor v);
    Element add(Element e);
    String getName();
}
