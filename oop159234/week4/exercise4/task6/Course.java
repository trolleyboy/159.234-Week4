package oop159234.week4.exercise4.task6;

/**
 * A class that describes a training course.
 */
public class Course {
    
    // attributes
    private static int numberOfCoursesCreate;
    private String name = null;
    private int numberOfDays = 0;
    private double price = 0.0;
    private int maximumParticipants = 0;
    
    public static final String COMPANY_NAME = "Mega Awesome Training Corp";

    /**
     * Constructor for Course objects.
     * @param name Name of the Course.
     * @param days Lengh of the Course in days. 
     * @param price Price of the Course in dollars.
     */
    // constructors
    // - use parameters
    public Course(String name, int days, double price) {
        setName(name);
        setNumberOfDays(days);
        setPrice(price);
        numberOfCoursesCreate++;
    }

    // - default
    public Course() {
        this("Unnamed Course", 3, 1000.00, 20);
    }

    /**
     * Constructor for Course objects, includes Max Participants.
     * @param maxParticipants Maximum number of people that can attend the course.
     */
    // - add MaxParticipants
    public Course(String name, int days, double price, int maxParticipants) {
        this(name, days, price);
        setMaxParticipants(maxParticipants);
    }

    // methods
    // - Class
    public static int getNumberOfCoursesCreated() {
        return numberOfCoursesCreate;
    }

    // - Name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // - NumberOfDays
    public int getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(int numDays) {
        if ( numDays >= 1 && numDays <=10 ) {
            numberOfDays = numDays;
        } else {
            System.out.println("Exception: Number of Days provided not an acceptable number.");
        }
        
    }

    // - Price
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // toString override
    public String toString() {
        return name + " course lasts " + numberOfDays + " days and costs $" + price;
    }

    // - Maximum Participants
    public int getMaxParticipants() {
        return maximumParticipants;
    }

    public void setMaxParticipants(int maxParticipants) {
        maximumParticipants = maxParticipants;
    }

    // task 7 - calculate discounted cost
    public double discountedCost(int percentDiscount) {
        return price * (1 - ( percentDiscount / 100.00 ));
    }

    // task 8 - calculate cost per head as flat rate
    public static double getCostPerHead(double flatRate, int participants) {
        return flatRate / participants;
    }
}
