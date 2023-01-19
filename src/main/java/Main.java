import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.println("Hello, my friend. You have to write 2 numbers");

        try {
            System.out.println("Write array size:");
            int n = Integer.parseInt(scanner.nextLine());
            for (int i = 0; i < n; i++) {
                Random random = new Random();
                list.add(random.nextInt(10));
            }
            System.out.println(list);
            System.out.println("Write filter number:");
            int m = Integer.parseInt(scanner.nextLine());
            Filter filter = new Filter(m);
            System.out.println(filter.filterOut(list));
        }
        catch (Exception e) {
            System.out.println("Wrong entered chars: " + e.getMessage());
        }

    }
}
