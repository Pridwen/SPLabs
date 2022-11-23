package Testul;

public class Student extends Semigrupa implements Element{
    private String name;
    private String email;

    public Student(String name, String email) {
        super(name);
        this.name = name;
        this.email = email;
    }

    @Override
    public String getName() {
        return name;
    }
    public String getEmail(){
        return email;
    }

    @Override
    public Element add(Element e) {
        super.add(e);
        return this;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitStudent(this);


    }
}

