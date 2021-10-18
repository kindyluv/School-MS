package Models;

public class Class {
    private long id;
    private String name;
    private static int count = 0;

    public Class(){
        this.id = ++count;
    }

    public Class(String name) {
        this.id = ++count;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

//    public void setCount(int count) {
//        this.count = count;
//    }
}
