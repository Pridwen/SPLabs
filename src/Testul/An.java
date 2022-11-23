package Testul;

import java.util.ArrayList;
import java.util.List;

public class An implements Element{
    private String an;
    private List<Element> elementList = new ArrayList<>();
    public An(String an) {
        this.an = an;
    }

    public String getAnul() {
        return an;
    }
    @Override
    public Element add(Element e) {
        elementList.add(e);
        return this;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void print() {

    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitAn(this);
        for(Element e:elementList) {
            e.accept(visitor);
        }
    }
}
