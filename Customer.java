package Assessment;

// Customer class representing a customer with first name and last name
public class Customer {
    private String firstName; // Variable to store the first name
    private String lastName; // Variable to store the last name
    
    // Constructor to initialize the first name and last name
    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Getter method to retrieve the first name
    public String getFirstName() {
        return firstName;
    }
    
    // Setter method to set the first name
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    // Getter method to retrieve the last name
    public String getLastName() {
        return lastName;
    }
    
    // Setter method to set the last name
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
