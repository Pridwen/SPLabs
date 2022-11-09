import java.util.concurrent.TimeUnit;

public class Image implements Element {
    private final String url;

    Image(String url) {
        this.url = url;
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String imageContent = null;
    }
    @Override
    public void print() {

        System.out.println("Image with name: "+ url);
    }
    public void add(Element e){
    }
    public void remove(Element e){
    }
    public Element get(int index){

        return null;
    }
    public void accept(Visitor v){
        v.visitImage(this);
    }
}