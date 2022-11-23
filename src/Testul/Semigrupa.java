package Testul;

import java.util.ArrayList;
import java.util.List;

public class Semigrupa implements Element{
    private String name;

    private List<Element> Students = new ArrayList<>();
    public Semigrupa(String name) {
        this.name = name;
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public Element add(Element e) {
        Students.add(e);
        return this;
    }

    @Override
    public void print() {

    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitSemigrupa(this);
        for(Element e:Students) {
            e.accept(visitor);
        }

    }
}

