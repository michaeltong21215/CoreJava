package Immutability;
import lombok.Data;

import java.util.Objects;

@Data
public final class Student {

    private final int id;
    private final String name;
    private final Age studentAge;

    public Age getStudentAge() {
        return studentAge;
    }

    public Student(int id, String name, Age age) {
        this.id = id;
        this.name = name;
        Age cloneAge = new Age();
        cloneAge.setYear(age.getYear());
        this.studentAge = cloneAge;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + studentAge +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
