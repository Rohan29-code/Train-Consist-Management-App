import java.util.*;
import java.util.stream.*;

class Bogie {
    String type;
    int capacity;

    Bogie(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public String toString() {
        return type + " Bogie - Capacity: " + capacity;
    }
}

public class Main {
    public static void main(String[] args) {

        // Reusing Bogie list (like UC7/UC8)
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 50));
        bogies.add(new Bogie("Sleeper", 80));
        bogies.add(new Bogie("AC Chair", 65));

        // 🔹 UC9: Grouping using Stream
        Map<String, List<Bogie>> groupedBogies =
                bogies.stream()
                        .collect(Collectors.groupingBy(b -> b.getType()));

        // 🔹 Display grouped result
        System.out.println("Grouped Bogies by Type:\n");

        for (String type : groupedBogies.keySet()) {
            System.out.println("Type: " + type);

            for (Bogie b : groupedBogies.get(type)) {
                System.out.println("  " + b);
            }
            System.out.println();
        }

        // 🔹 Check original list unchanged
        System.out.println("Original Bogie List:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }
    }
}