package Aggregation;

public class Aggregation1 {
    
    String name;
    int id;

    public Aggregation1(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void display() {
        System.out.println("Name: " + name + ", ID: " + id);
    }
}
