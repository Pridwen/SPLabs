public class Paragraph implements Element {
    public String name;
    AlignStrategy x;
    Paragraph(String name) {
        this.name=name;
    }

    public void setAlignStrategy(AlignStrategy strat){
        this.x=strat;
    }

    @Override
    public void print(){

        if(x==null) {
            System.out.println(this.name);
        }else{
            x.render(new Paragraph(this.name));
        }
    }

    @Override
    public void add(Element e) {

    }

    @Override
    public void remove(Element e) {

    }

    @Override
    public Element get(int index) {
        return null;
    }
}

