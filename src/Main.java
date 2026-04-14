import java.util.*;
import java.util.regex.*;
import java.util.stream.Collectors;

class Bogie {
    private String type;
    private int capacity;

    public Bogie(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "Bogie{" +
                "type='" + type + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String trainIdRegex = "TRN-\\d{4}";
        String cargoCodeRegex = "PET-[A-Z]{2}";

        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 48));
        bogies.add(new Bogie("Executive AC", 80));
        bogies.add(new Bogie("Sleeper", 65));

        // Original List
        System.out.println("\nOriginal Bogie List:");
        bogies.forEach(System.out::println);

        // UC8: Filtering
        List<Bogie> filteredBogies = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        System.out.println("\nFiltered Bogies (Capacity > 60):");
        filteredBogies.forEach(System.out::println);

        // UC9: Grouping
        Map<String, List<Bogie>> groupedBogies =
                bogies.stream()
                        .collect(Collectors.groupingBy(Bogie::getType));

        System.out.println("\nGrouped Bogies by Type:");
        for (String type : groupedBogies.keySet()) {
            System.out.println("Type: " + type);
            groupedBogies.get(type).forEach(b -> System.out.println("  " + b));
        }

        // UC10: Reduce (Total Seats)
        int totalSeats = bogies.stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);

        System.out.println("Validation complete. Proceeding with train operations...");
    }
}