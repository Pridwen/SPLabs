public class Table implements Element{
    private final String title;

    public Table(String title) {

        this.title = title;
    }


    @Override
    public void print(){

        System.out.println("Table with Title: "+title);
    }

    public void add(Element e){
    }
    public void remove(Element e){
    }
    public Element get(int index){

        return null;
    }
    public void accept(Visitor v){
        v.visitTable(this);
    }
}
