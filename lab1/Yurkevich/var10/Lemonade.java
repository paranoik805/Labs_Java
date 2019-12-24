package bsu.rfe.java.group9.lab1.Yurkevich.var10;

public class Lemonade extends Food {
    private String taste = null;

    public Lemonade(String taste){
        super("Lemonade");
        this.taste = taste;
    }

    @Override
    public String toString() {
        return taste + " " + super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (super.equals(obj)){
            if (!(obj instanceof Lemonade)){
                return taste.equals(((Lemonade)obj).taste);
            }
            else return false;
        }
        else return false;
    }

    public String getTaste(){
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    @Override
    public void consume() {
        System.out.println(this + " is consumed!");
    }
}
