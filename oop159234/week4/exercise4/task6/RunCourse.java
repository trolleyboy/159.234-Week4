package oop159234.week4.exercise4.task6;

public class RunCourse {
    
    public static void main(String[] args) {
        
        Course course1 = new Course("Course1", 3, 500.00);

        System.out.println("Course Name: " + course1.getName());
        System.out.println("Course Price: $" + course1.getPrice());
        System.out.println("Course Length: " + course1.getNumberOfDays());
        System.out.println("Course Max Participants: " + course1.getMaxParticipants());
        System.out.println("Courses: " + Course.getNumberOfCoursesCreated());

        Course course2 = new Course("Course2", 3, 500.00, 20);

        System.out.println("Course Name: " + course2.getName());
        System.out.println("Course Price: $" + course2.getPrice());
        System.out.println("Course Length: " + course2.getNumberOfDays());
        System.out.println("Course Max Participants: " + course2.getMaxParticipants());
        System.out.println("Courses: " + Course.getNumberOfCoursesCreated());


        Course course3 = new Course("Course3", 3, 500.00, 20);

        System.out.println("Course Name: " + course3.getName());
        System.out.println("Course Price: $" + course3.discountedCost(20));
        System.out.println("Course Length: " + course3.getNumberOfDays());
        System.out.println("Course Max Participants: " + course3.getMaxParticipants());
        System.out.println("Courses: " + Course.getNumberOfCoursesCreated());

        double fixedPrice = 10000;
        System.out.println("Course Name: Custom" );
        System.out.println("Course Fixed Price: $" + fixedPrice);
        System.out.println("Course Price Per Person: $" + Course.getCostPerHead(fixedPrice, 5));

        System.out.println("Training Provider: " + Course.COMPANY_NAME);
    }

}
