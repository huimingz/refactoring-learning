package refactoring.chapter08.s05_replace_array_with_object;

public class Foo {
    void some() {
        String[] row = new String[3];
        row[0] = "Liverpool";
        row[1] = "15";

        String name = row[0];
        int wins = Integer.parseInt(row[1]);
    }
}
