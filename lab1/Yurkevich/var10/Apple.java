package bsu.rfe.java.group9.lab1.Yurkevich.var10;

public class Apple extends Food {
    private String size;
    public Apple(String size) {
        super("Apple");
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object obj) {
        if (super.equals(obj)){
            if (!(obj instanceof Apple)){
                return size.equals(((Apple)obj).size);
            }
            else return false;
        }
        else return false;
    }

    @Override
    public String toString() {
        return size + " " + super.toString();
    }

    @Override
    public void consume() {
        System.out.println(this + " is consumed!");
    }
}