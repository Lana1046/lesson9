import java.util.List;

public interface Student {
    String getName();
    List<Course> getAllCourses();
}

class StudentClass implements Student {
    public List<Course> courses;

    @Override
    public String getName() {
        return null;
    }

    @Override
    public List<Course> getAllCourses() {
        return courses;
    }
}


