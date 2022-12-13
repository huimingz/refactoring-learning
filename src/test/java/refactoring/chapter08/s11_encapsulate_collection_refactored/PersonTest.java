package refactoring.chapter08.s11_encapsulate_collection_refactored;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PersonTest {
    @Test
    public void should() {
        Person kent = new Person();
        kent.addCourse(new Course("Smalltalk Programming", false));
        kent.addCourse(new Course("Appreciating Single Malts", true));
        Assertions.assertEquals(2, kent.numberOfCourses());

        Course refact = new Course("Refactoring", true);
        kent.addCourse(refact);
        kent.addCourse(new Course("Brutal Sarcasm", false));
        Assertions.assertEquals(4, kent.numberOfCourses());

        kent.removeCourse(refact);
        Assertions.assertEquals(3, kent.numberOfCourses());

        Assertions.assertEquals(1, kent.numberOfAdvancedCourses());
    }
}
