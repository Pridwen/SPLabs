public class Image implements Element {
    private final String img;
    public Image(String img) {
        this.img = img;
    }

    public void print(){
        System.out.println(img);
    }
}