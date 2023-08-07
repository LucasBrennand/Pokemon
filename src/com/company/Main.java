package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("-----------------------------------------------------");
            System.out.println("\tJava Trainer wants to battle");
            System.out.println("\tJava Trainer sents out Lapras!\n");
            System.out.println("You sent out Charmander.");
            System.out.println("Choose your next move.");
            Charmander charmanderStats = new Charmander(282, 282, "Fire");
        }
    }
}
