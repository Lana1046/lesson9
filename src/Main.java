import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    // 1. Написать функцию, принимающую список Student
    // и возвращающую список уникальных курсов, на которые подписаны студенты.
    static List<Course> getUniqueCourses(List<Student> students) {
        return students.stream().flatMap(s->s.getAllCourses().stream()).distinct().collect(Collectors.toList());
    }

    // 2. Написать функцию, принимающую на вход список Student
    // и возвращающую список из трех самых любознательных (любознательность определяется количеством курсов).
    static List<Student> getMostCuriousStudents(List<Student> students) {
        return students.stream().sorted((s1, s2) -> s2.getAllCourses().size() - s1.getAllCourses().size()).limit(3).collect(Collectors.toList());
    }

    // 3. Написать функцию, принимающую на вход список Student
    // и экземпляр Course, возвращающую список студентов, которые посещают этот курс.
    static List<Student> getStudentsOnCourse(List<Student> students, Course course) {
        return students.stream().filter(s -> s.getAllCourses().contains(course)).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        var course1 = new MyCourse();
        course1.setId(0);
        var course2 = new MyCourse();
        course2.setId(4);;

        var student1 = new StudentClass();
        student1.courses = new ArrayList<Course>();
        student1.courses.add(course1);
        student1.courses.add(course2);
        student1.courses.add(course2);

        var student2 = new StudentClass();
        student2.courses = new ArrayList<Course>();
        student2.courses.add(course1);
        student2.courses.add(course2);

        var student3 = new StudentClass();
        student3.courses = new ArrayList<Course>();
        student3.courses.add(course1);
        student3.courses.add(course1);
        student3.courses.add(course1);
        student3.courses.add(course1);

        var student4 = new StudentClass();
        student4.courses = new ArrayList<Course>();
        student4.courses.add(course1);
        student4.courses.add(course2);

        var studentsList = new ArrayList<Student>();
        studentsList.add(student1);
        studentsList.add(student2);
        studentsList.add(student3);
        studentsList.add(student4);

        // debug
        var result = getStudentsOnCourse(studentsList, course2);
    }
}

