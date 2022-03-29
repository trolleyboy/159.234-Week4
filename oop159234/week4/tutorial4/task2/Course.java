package oop159234.week4.tutorial4.task2;

public class Course {
    
    // attributes
    private static int numberOfCoursesCreate;
    private String name = null;
    private int numberOfDays = 0;
    private double price = 0.0;

    private Module[] modules = new Module[20];
    private int moduleCount = 0;

    //Constructors
    // - use parameters
    public Course(String name, int days, double price) {
        setName(name);
        setNumberOfDays(days);
        setPrice(price);
        numberOfCoursesCreate++;
    }

    // - default
    public Course() {
        this("Unnamed Course", 3, 1000.00);
    }

    //Methods
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

    // - Modules
    public void addModule(Module module) {
        if (moduleCount < modules.length) {
            modules[moduleCount] = module;
            moduleCount++;
        } else {
            System.out.println("Cannot add more modules");
        }
    }

    public Module[] getModules() {
        return modules;
    }

    public int getModuleCount() {
        return moduleCount;
    }

    public int getTotalCredits() {
        int totalCredits = 0;
        for (int i = 0; i < moduleCount; i++) {
            totalCredits += getModules()[i].getCreditPoints();
        }
        return totalCredits;
    }

}
