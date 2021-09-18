package z20210918.z20210918Obiektowe.pkg.z20210918ObiektoweZ2;

public class Poem {
 private Author creator;

    public Author getCreator() {
        return creator;
    }

    public void setCreator(Author creator) {
        this.creator = creator;
    }

    public int getStropheNum() {
        return stropheNum;
    }

    public void setStropheNum(int stropheNum) {
        this.stropheNum = stropheNum;
    }

    private  int stropheNum;

    public Poem(Author creator, int stropheNum) {
        this.creator = creator;
        this.stropheNum = stropheNum;
    }

    public void print() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Poem{" +
                "creator=" + creator +
                ", stropheNum=" + stropheNum +
                '}';
    }
}
