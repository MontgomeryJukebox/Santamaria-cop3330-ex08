import java.util.InputMismatchException;
import java.util.Scanner;

public class Challenge1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        do {
            try {
                System.out.print("How many people?");
                int people = in.nextInt();
                System.out.print("How many pizzas do you have?");
                int pizzas = in.nextInt();
                System.out.print("How many slices per pizza?");
                int slices = in.nextInt();
                System.out.printf("%d people with %d pizzas (%d slices)\n",
                        people, pizzas, pizzas * slices);
                System.out.printf("Each person gets %d pieces of pizza\n", pizzas * slices / people);
                System.out.printf("There are %d leftover pieces.", pizzas * slices % people);
                break;
            } catch (InputMismatchException e) {
                System.out.println("You must enter a numeric value! Starting from the beginning...");
                in.nextLine();
            }
        } while (true);
    }
}
