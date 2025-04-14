package Buoi12;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class StudentDemo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();
        students.add(new Student("1", "An"));
        students.add(new Student("2", "Binh"));
        // serialize
        try (ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream("C:\\java\\students.dat"))) {
            for (Student s : students)
                out.writeObject(s);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        List<Student> inputStudents = new ArrayList<Student>();
        // deserialize
        // detect end of file using the FileInputStream object
        try (FileInputStream fi = new FileInputStream("C:\\java\\students.dat");
                ObjectInputStream in = new ObjectInputStream(fi)) {
            while (fi.available() > 0) {
                inputStudents.add((Student) in.readObject());
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        for (Student s : inputStudents) {
            System.out.println(s);
        }
    }
}