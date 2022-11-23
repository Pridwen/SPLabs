package Testul;

public class PrintVisitor implements Visitor {

    @Override
    public void visitAn(An an) {

        System.out.println(an.getAnul());
    }

    @Override
    public void visitGrupa(Grupa grupa) {
        System.out.println("\t" + grupa.getName());
    }

    @Override
    public void visitSemigrupa(Semigrupa semigrupa) {
        System.out.println("\t\t" + semigrupa.getName());
    }

    @Override
    public void visitStudent(Student student) {
        System.out.println("\t\t\t" + student.getName() + "  --  " +  student.getEmail());
    }

    @Override
    public void printStats() {

    }
}

