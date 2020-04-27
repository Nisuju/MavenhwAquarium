package epam;

import TwoAquarium.Aquarium;
import TwoAquarium.Fish;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Aquarium aquarium = new Aquarium();


        while (true) {
            System.out.print("Text anything to start: ");
            String anyString = scanner.nextLine();
            System.out.print("If you want to input fish then enter <1>, otherwise enter <0> ");
            String check = scanner.nextLine();
            if (check.equals("1")) {
                System.out.print("Enter the fish's type ");
                String fishType = scanner.nextLine();
                System.out.print("Enter the fish's name ");
                String fishName = scanner.nextLine();
                System.out.print("Enter the fish's age ");
                int fishAge = scanner.nextInt();
                Fish fish = new Fish(fishType, fishName, fishAge);
                aquarium.addFish(fish);

            } else {
                break;
            }

        }
        aquarium.showAllFishesInAquarium();


    }
}