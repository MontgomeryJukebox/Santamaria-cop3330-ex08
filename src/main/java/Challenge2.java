import java.util.Scanner;

public class Challenge2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
            System.out.print("How many people?");
            int people = in.nextInt();
            System.out.print("How many pizzas do you have?");
            int pizzas = in.nextInt();
            System.out.print("How many slices per pizza?");
            int slices = in.nextInt();
            System.out.printf("%d people with %d pizzas (%d slices)",
                    people, pizzas, pizzas * slices);
            System.out.printf("Each person gets %d %s of pizza",
                    pizzas * slices / people, (pizzas * slices / people == 1) ? "piece" : "pieces");
            System.out.printf("There are %d leftover pieces.");
    }
}