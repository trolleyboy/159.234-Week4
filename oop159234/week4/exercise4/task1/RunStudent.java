package oop159234.week4.exercise4.task1;

public class RunStudent {
    public static void main(String[] args) {
        
        Student student1 = new Student();
        Student student2 = new Student();

        student1.setName("Lily");
        student1.setAge(8);

        student2.setName("Dad");
        student2.setAge(38);

        System.out.println("Student1: Name: " + student1.getName() + "\tAge: " + student1.getAge());
        System.out.println("Student2: Name: " + student2.getName() + "\tAge: " + student2.getAge());

    }
}
