import java.util.ArrayList;

public class Chapter {
    public String ch;
    public ArrayList<Subchapter> subChapters=new ArrayList<>();
    public Chapter(String ch) {

        this.ch = ch;
    }
    public void print(){
        System.out.println(ch);
        for(Subchapter el:subChapters)
            el.print();
    }
    public int createSubChapter(String s)
    {
        subChapters.add(new Subchapter(s));
        return subChapters.size()-1;
    }
    public Subchapter getSubChapter(int i)
    {

        return subChapters.get(i);
    }
}