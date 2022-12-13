package refactoring.chapter08.s11_encapsulate_collection_refactored;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Person {
    private Set<Course> courses = new HashSet<>();

    public void addCourse(Course course) {
        this.courses.add(course);
    }

    public void removeCourse(Course course) {
        this.courses.remove(course);
    }

    public Set<Course> getCourses() {
        return Collections.unmodifiableSet(this.courses);
    }

    public void initializeCourses(Set<Course> courses) {
        Iterator<Course> iter = courses.iterator();
        while (iter.hasNext()) {
            addCourse(iter.next());
        }
    }

    public int numberOfCourses() {
        return this.courses.size();
    }

    public int numberOfAdvancedCourses() {
        Iterator<Course> iter = this.courses.iterator();
        int count = 0;
        while (iter.hasNext()) {
            if (iter.next().isAdvanced()) count++;
        }
        return count;
    }
}
