package bsu.rfe.java.group9.lab1.Yurkevich.var10;

public abstract class Food implements Consumable {
    String name = null;

    public Food(String name){
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Food)) return false;
        if (name == null || ((Food)obj).name == null) return false;
        return name.equals(((Food)obj).name);
    }

    @Override
    public String toString(){
        return name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}
