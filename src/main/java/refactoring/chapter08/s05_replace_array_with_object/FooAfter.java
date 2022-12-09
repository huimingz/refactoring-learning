package refactoring.chapter08.s05_replace_array_with_object;

public class FooAfter {
    void some() {
        Performance row = new Performance();
        row.setName("Liverpool");
        row.setWins("15");

        String name = row.getName();
        int wins = row.getWins();
    }

    class Performance {
        private String name;
        private int wins;

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getWins() {
            return this.wins;
        }

        public void setWins(String wins) {
            this.wins = Integer.parseInt(wins);
        }
    }
}
