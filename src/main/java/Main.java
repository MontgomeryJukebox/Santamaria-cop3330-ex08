/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 David Santamaria
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("How many people?");
        int people = in.nextInt();
        System.out.print("How many pizzas do you have?");
        int pizzas = in.nextInt();
        System.out.print("How many slices per pizza?");
        int slices = in.nextInt();
        System.out.printf("%d people with %d pizzas (%d slices)\n", people, pizzas, pizzas * slices);
        System.out.printf("Each person gets %d slices of pizza.", pizzas * slices / people);
        System.out.printf("There are %d leftover pieces.", pizzas * slices % people);
    }
}