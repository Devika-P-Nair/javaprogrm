package Aggregation;

public class Aggregation2 {
    
    String city;
    String state;
    Aggregation1 ref; // Reference variable for Aggregation1

    public Aggregation2(String city, String state, Aggregation1 ref) {
        this.city = city;
        this.state = state;
        this.ref = ref;
    }

    public void display() {
        System.out.println("City: " + city + ", State: " + state);
        ref.display(); // Display Aggregation1 details
    }

    public static void main(String[] args) {
        // Creating an instance of Aggregation1
        Aggregation1 obj = new Aggregation1("Dev", 9);
        
        // Creating an instance of Aggregation2 and passing Aggregation1 object
        Aggregation2 address = new Aggregation2("New York", "NY", obj);

        // Displaying details
        address.display();
    }
}
