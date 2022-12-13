package refactoring.chapter08.s11_encapsulate_collection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PersonTest {
    @Test
    public void should() {
        Person kent = new Person();
        Set<Course> s = new HashSet<>();

        s.add(new Course("Smalltalk Programming", false));
        s.add(new Course("Appreciating Single Malts", true));
        kent.setCourses(s);
        Assertions.assertEquals(2, kent.getCourses().size());

        Course refact = new Course("Refactoring", true);
        kent.getCourses().add(refact);
        kent.getCourses().add(new Course("Brutal Sarcasm", false));
        Assertions.assertEquals(4, kent.getCourses().size());

        kent.getCourses().remove(refact);
        Assertions.assertEquals(3, kent.getCourses().size());

        Iterator<Course> iter = kent.getCourses().iterator();
        int count = 0;
        while (iter.hasNext()) {
            Course each = iter.next();
            if (each.isAdvanced()) count++;
        }
        Assertions.assertEquals(1, count);
    }
}
