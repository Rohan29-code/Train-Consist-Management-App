import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> consist = new LinkedList<>();

        consist.add("Engine");
        consist.add("Sleeper");
        consist.add("AC");
        consist.add("Cargo");
        consist.add("Guard");

        consist.add(2, "Pantry Car");

        consist.removeFirst();
        consist.removeLast();

        System.out.println("Final Train Consist:");
        for (String bogie : consist) {
            System.out.println(bogie);
        }
    }
}