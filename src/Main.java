import java.util.*;

public class Main {
    static List<String> tasks = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a task:");
        String task = scanner.nextLine();
        tasks.add(task);
        System.out.println("Task added: " + task);
    }
}