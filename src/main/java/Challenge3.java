import java.util.Scanner;

public class Challenge3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("How many people?");
        int people = in.nextInt();
        System.out.print("How many slices does each person want?");
        int slices = in.nextInt();
        System.out.print("How many slices per pizza?");
        int spp = in.nextInt(); // slices per pizza
        System.out.printf("You will have to buy %d whole pizzas. There will be %d leftover slices",
                people * slices / spp, people * slices % spp);
    }
}
