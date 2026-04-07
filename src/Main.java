import java.util.*;
import java.util.stream.Collectors;

class Bogie {
    String type;
    int capacity;

    public Bogie(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return type + " (" + capacity + ")";
    }
}

public class Main {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // 🔹 Bogie List (reuse from UC7/UC8/UC9)
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 48));
        bogies.add(new Bogie("Executive AC", 80));
        bogies.add(new Bogie("Sleeper", 65));

        // 🔹 Original List
        System.out.println("\nOriginal Bogie List:");
        bogies.forEach(System.out::println);

        // 🔹 UC8: Filtering
        List<Bogie> filtered = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        System.out.println("\nFiltered Bogies (Capacity > 60):");
        filtered.forEach(System.out::println);

        // 🔹 UC9: Grouping
        Map<String, List<Bogie>> grouped =
                bogies.stream()
                        .collect(Collectors.groupingBy(Bogie::getType));

        System.out.println("\nGrouped Bogies:");
        grouped.forEach((type, list) -> {
            System.out.println(type + ": " + list);
        });

        // 🔹 UC10: Reduce (TOTAL SEATS)
        int totalSeats = bogies.stream()
                .map(b -> b.capacity)      // extract capacity
                .reduce(0, Integer::sum);  // sum all

        System.out.println("\nTotal Seating Capacity: " + totalSeats);
    }
}