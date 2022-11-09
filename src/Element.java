public interface Element {
    void print();
    void accept(Visitor v);
    void add(Element e);
    void remove(Element e);
    Element get(int index);

}
