import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Student student1 = new Student("Gianni", 44);
        Student student2 = new Student("Gianna", 45);
        Student student3 = new Student("Giannino", 46);
        Student student4 = new Student("Giannone", 47);
        Student student5 = new Student("Janni", 48);
        Student student6 = new Student("Giannona", 49);
        Student student7 = new Student("Gian", 50);
        Student student8 = new Student("Giann", 51);
        Student student9 = new Student("Xanni", 52);
        Student student10 = new Student("Xiannona", 53);
        Student student11 = new Student("Xian", 54);
        Student student12 = new Student("Xiann", 55);
        students.add(student6);
        students.add(student1);
        students.add(student3);
        students.add(student2);
        students.add(student4);
        students.add(student5);
        students.add(student7);
        students.add(student8);
        students.add(student9);
        students.add(student12);
        students.add(student10);
        students.add(student11);
        System.out.println(students);
        students.sort(Comparator.comparingInt(Student::getAge));
        System.out.println(students);
    }
}