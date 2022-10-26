public class Image implements Element {
    private String name;

    public Image(String name) {
        this.name = name;
    }
    @Override
    public void print() {
        System.out.println("Image with name: "+name);
    }


    public void add(Element e){
    }
    public void remove(Element e){
    }
    public Element get(int index){
        return null;
    }
}