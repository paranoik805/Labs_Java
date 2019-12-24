package bsu.rfe.java.group9.lab1.Yurkevich.var10;

public class Main {

    public static void main(String[] args) {
        Food[] breakfast = new Food[20];

        int itemsSoFar = 0;
        for (String arg: args) {
            String[] parts = arg.split("/");
            if (parts[0].equals("Cheese")) {
                breakfast[itemsSoFar] = new Cheese();
            }
            else if (parts[1].equals("Apple")) {
                breakfast[itemsSoFar] = new Apple(parts[0]);
            }
            else if (parts[1].equals("Lemonade")) {
                breakfast[itemsSoFar] = new Lemonade(parts[0]);
            }
            itemsSoFar++;
        }

        for (Food item: breakfast)
            if (item!=null)
                item.consume();
            else
                break;

        System.out.println("\nGood luck!");
    }
}