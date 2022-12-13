package refactoring.chapter08.s11_encapsulate_collection;

import java.util.Set;

public class Person {
    private Set<Course> courses;

    public Set<Course> getCourses() {
        return courses;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }
}
