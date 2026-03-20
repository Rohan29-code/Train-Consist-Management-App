import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {

        LinkedHashSet<String> formation = new LinkedHashSet<>();

        formation.add("Engine");
        formation.add("Sleeper");
        formation.add("Cargo");
        formation.add("Guard");

        formation.add("Sleeper");

        System.out.println("Final Train Formation:");
        for (String bogie : formation) {
            System.out.println(bogie);
        }
    }
}