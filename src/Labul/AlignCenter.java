package Labul;

public class AlignCenter implements AlignStrategy {
    Paragraph par;
    @Override
    public void render(Paragraph x) {
        System.out.println("+++++"+x.name+"+++++");
    }
}
