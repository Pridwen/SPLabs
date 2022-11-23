package Testul;

import java.util.ArrayList;
import java.util.List;

public class Grupa extends An{

    private String name;
    private List<Element> Subgroups = new ArrayList<>();
    public Grupa(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public Element add(Element e) {
        Subgroups.add(e);
        return this;
    }


    @Override
    public void accept(Visitor visitor) {
        visitor.visitGrupa(this);
        for(Element e:Subgroups) {
            e.accept(visitor);
        }
    }

    @Override
    public String getName() {
        return name;
    }
}

