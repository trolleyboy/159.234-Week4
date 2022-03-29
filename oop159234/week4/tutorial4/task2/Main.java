package oop159234.week4.tutorial4.task2;

public class Main {
    
    public static void main(String[] args) {
        
        Prospectus prospectus = new Prospectus();

        Course course1 = new Course("Software Testing", 5, 2000);
        Module module1 = new Module("Unit Testing", 10, "Assessment");
        Module module2 = new Module("Acceptance Testing", 20, "Coursework");
        Module module3 = new Module("Boundary Values", 10, "Exam");
        course1.addModule(module1);
        course1.addModule(module2);
        course1.addModule(module3);


        Course course2 = new Course("System Analysis", 3, 1000);
        Module module4 = new Module("Use Cases", 10, "Seminar");
        Module module5 = new Module("Class Diagrams", 10, "Presentation");
        course2.addModule(module1);
        course2.addModule(module4);
        course2.addModule(module5);

        prospectus.addCourse(course1);
        prospectus.addCourse(course2);
        prospectus.displayCourses();

    }

}
