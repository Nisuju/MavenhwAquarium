package epam;

import TaskTwoPair.Aquarium;
import TaskTwoPair.Fish;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<Fish> listObjectsEnteredConsole = new ArrayList<Fish>();
        Scanner scanner = new Scanner(System.in);
        Aquarium aquarium = new Aquarium() {
            @Override
            public void addFish(Fish fish) {
                super.addFish(fish);
            }
        };

        System.out.print("How many fish will you add? ");
        int numberOfFishToBeEntered = scanner.nextInt();


        for (int i = 0; i < numberOfFishToBeEntered; i++) {
            String anyString = scanner.nextLine();
            System.out.print("Enter the fishType: ");
            String fishType = scanner.nextLine();
            System.out.println("fishType entered");
            System.out.print("Enter the fishName: ");
            String fishName = scanner.nextLine();
            System.out.println("fishName entered");
            System.out.print("Enter the fishAge: ");
            int fishAge = scanner.nextInt();
            System.out.println("fishAGe entered");
            listObjectsEnteredConsole.add(new Fish(fishType, fishName, fishAge){
                @Override
                public String getName() {
                    return super.getName();
                }
            });

            System.out.println("OBJECT CREATED");//1

        }

        for(int i=0;i<numberOfFishToBeEntered;i++){
            aquarium.addFish(listObjectsEnteredConsole.get(i));
        }
 //       listObjectsEnteredConsole.get(0).setAge(999); // просто хотел показать что могу редактирвать поля,подумал вдруг нужно

        aquarium.showAllFishesInAquarium();



    }

}
