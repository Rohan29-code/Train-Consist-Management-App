import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Set<String> bogieSet = new HashSet<>();

        System.out.println("Enter number of bogies:");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter Bogie ID:");
            String id = sc.nextLine();
            bogieSet.add(id);
        }

        System.out.println("Unique Bogie IDs:");
        for (String id : bogieSet) {
            System.out.println(id);
        }
    }
}