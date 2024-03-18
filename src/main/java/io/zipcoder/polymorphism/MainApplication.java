package io.zipcoder.polymorphism;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class MainApplication {

    LinkedHashMap<String, String> getPets(){
        Scanner newScanner = new Scanner(System.in);
        System.out.println("How many pets do you have");
        int numPets = newScanner.nextInt();
        newScanner.nextLine();
        LinkedHashMap<String, String> pets = new LinkedHashMap<>();


        for(int i = 0; i < numPets; i++){
            System.out.println("Enter type of pet");
            String petType = newScanner.nextLine();
            System.out.println("Enter pet name");
            String petName = newScanner.nextLine();
            pets.put(petType, petName);
        }
        System.out.println(pets.toString());
        return pets;
    }

    public static void main(String[] args){
        MainApplication main = new MainApplication();
        LinkedHashMap<String, String> pets = main.getPets();
    }
}
