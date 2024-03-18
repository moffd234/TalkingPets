package io.zipcoder.polymorphism;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MainApplication {

    public static void main(String[] args){
        MainApplication main = new MainApplication();
        LinkedHashMap<Pet, String> pets = main.getPets();
        printPetsAndSpeak(pets);
    }




    LinkedHashMap<Pet, String> getPets() {
        Scanner newScanner = new Scanner(System.in);
        System.out.println("How many pets do you have");
        int numPets = newScanner.nextInt();
        newScanner.nextLine(); // Get end of line character
        LinkedHashMap<Pet, String> pets = new LinkedHashMap<>();


        for (int i = 0; i < numPets; i++) {
            System.out.println("Enter type of pet");
            String petType = newScanner.nextLine();


            System.out.println("Enter pet name");
            String petName = newScanner.nextLine();

            if (petType.toLowerCase().equals("dog")) {
                Dog dog = new Dog(petName);
                pets.put(dog, petName);
            } else if (petType.toLowerCase().equals("cat")) {
                Cat cat = new Cat(petName);
                pets.put(cat, petName);
            } else if (petType.toLowerCase().equals("macaw")) {
                Macaw macaw = new Macaw(petName);
                pets.put(macaw, petName);
            }
        }
        return pets;
    }

    public static void printPetsAndSpeak(LinkedHashMap<Pet, String> printPets) {
        for (Map.Entry<Pet, String> entry : printPets.entrySet()) {
            System.out.println(entry.getKey().getName());
            System.out.println(entry.getKey().speak());
        }
    }


}
