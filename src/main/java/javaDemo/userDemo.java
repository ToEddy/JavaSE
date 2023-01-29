package javaDemo;

public class userDemo {
    public static void main(String[] args) {
        kk kk = new kk();
        kk kk1 = new kk();
        kk kk2 = new kk();
        System.out.println(kk.getId());
        System.out.println(kk1.getId());
        System.out.println(kk2.getId());
        System.out.println(kk.getName());
        System.out.println(kk1.getName());
        System.out.println(kk2.getName());
    }
}

class kk{
    private static int nextId;
    private String name = "jack";
    private int id  = assignId();
    private static int assignId(){
        int r = nextId;
        nextId++;
        return r;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        kk.nextId = nextId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
